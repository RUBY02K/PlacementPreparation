package com.example.journal.app.service;

import com.example.journal.app.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.journal.app.repository.journalEntryRepository;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService{

    @Autowired
    private journalEntryRepository journalEntryRepository;
    // this is dependency injection
 public void saveEntry(JournalEntry journalEntry) {
     journalEntryRepository.save(journalEntry);
//    controller ---> service -->repository
    // Business logic methods
    }
}
