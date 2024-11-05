package com.sw2.sastreria.sales.repositories;

import com.sw2.sastreria.sales.collections.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
