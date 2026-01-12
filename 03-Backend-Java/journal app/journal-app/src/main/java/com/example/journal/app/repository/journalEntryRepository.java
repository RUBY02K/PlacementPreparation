package com.example.journal.app.repository;

import com.example.journal.app.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface journalEntryRepository  extends MongoRepository <JournalEntry,String> {

}
