package com.sw2.sastreria.sales.controllers;

import com.sw2.sastreria.sales.collections.DetailNote;
import com.sw2.sastreria.sales.collections.Note;
import com.sw2.sastreria.sales.repositories.NoteRepository;
import com.sw2.sastreria.utils.PaginatedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Controller
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;


    @QueryMapping
    public PaginatedResponse<Note> findAllNotes(@Argument int limit, @Argument int offset) {
        List<Note> allNotes = noteRepository.findAll();
        int total = allNotes.size();

        int end = Math.min(offset + limit, allNotes.size());
        List<Note> paginatedMaterials = offset > allNotes.size() ?
                Collections.emptyList() :
                allNotes.subList(offset, end);
        return new PaginatedResponse<>(paginatedMaterials, total);
    }


    @QueryMapping
    public Note findNoteById(@Argument String id) {
        return noteRepository.findById(id).orElse(null);
    }




    @MutationMapping
    public Note createNote(@Argument String fecha, @Argument String tipo, @Argument Float monto, @Argument List<DetailNote> detailNotes) {
        Note note = new Note();
        note.setFecha(fecha);
        note.setTipo(tipo);
        note.setMontoTotal(monto);
        note.setDetailNotes(detailNotes);
        return noteRepository.save(note);
    }

    @MutationMapping
    public Note updateNote(@Argument String id,@Argument String fecha, @Argument String tipo, @Argument Float monto,@Argument List<DetailNote> detailNotes) {
        Optional<Note> optionalCustomer = noteRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Note customer = optionalCustomer.get();
            if (fecha != null) customer.setFecha(fecha);
            if (tipo != null) customer.setTipo(tipo);
            if (monto != null) customer.setMontoTotal(monto);
            if (detailNotes != null) customer.setDetailNotes(detailNotes);
            return noteRepository.save(customer);
        }
        return null;
    }

    @MutationMapping
    public String deleteNote(@Argument String id) {
        noteRepository.deleteById(id);
        return "Customer deleted successfully";
    }

}
