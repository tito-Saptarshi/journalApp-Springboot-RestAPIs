package com.saptarshi.journalApp.repository;

import com.saptarshi.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String > {
}
