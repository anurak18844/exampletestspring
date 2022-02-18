package com.example.demo.repository;

// import java.util.List;

import com.example.demo.models.Factory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FactoryRepository extends MongoRepository<Factory, String>{

    // private CameraService cameraService;

    // public List<Factory> findByNameContaining(String name); 

    // public List<Camera> findAllCamera();
    
}
