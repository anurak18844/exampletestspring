package com.example.demo.repository;

import com.example.demo.models.Event;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String>{
    
}
