package com.sw2.sastreria.purchases.repositories;

import com.sw2.sastreria.purchases.collections.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
