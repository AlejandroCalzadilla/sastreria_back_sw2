package com.sw2.sastreria.sales.repositories.venta;

import com.sw2.sastreria.sales.collections.venta.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
