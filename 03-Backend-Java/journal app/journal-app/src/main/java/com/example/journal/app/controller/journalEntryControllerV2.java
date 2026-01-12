package com.example.journal.app.controller;

import com.example.journal.app.entity.JournalEntry;
import com.example.journal.app.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping()
    public List<JournalEntry> getAll() {
     return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myentry) {
        journalEntryService.saveEntry(myentry);
 return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getjournalentrybyid(@PathVariable Long myId) {
  return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deletejournalentrybyid(@PathVariable Long myId) {
    return null;
    }

    @PutMapping("id/{Id}")
    public JournalEntry updatejournalentrybyid(@PathVariable Long Id , @RequestBody JournalEntry myentry) {
    return null;
    }
}
