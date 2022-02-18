package com.example.demo.repository;

import com.example.demo.models.Camera;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CameraRepository extends MongoRepository<Camera, String>{

    //   public List<Factory> findByNameContaining(String name); 
    
}
