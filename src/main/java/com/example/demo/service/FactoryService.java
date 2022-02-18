package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Camera;
import com.example.demo.models.Factory;
import com.example.demo.repository.FactoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryService {
    @Autowired
    private FactoryRepository factoryRepository;

    public List<Factory> getFactories(){
        return factoryRepository.findAll();
    }


    public Optional<Factory> findById(String id){
        return factoryRepository.findById(id);
    }

    public Factory addFactory(Factory factory){
        return factoryRepository.save(factory);
    }
    
    public Optional<Factory> addCamera(String id, Camera camera){
        Factory currentFactory = factoryRepository.findById(id).get();
        List<Camera> cameras = currentFactory.getCameras();
        cameras.add(camera);
        currentFactory.setCameras(cameras);
        return Optional.of(factoryRepository.save(currentFactory));
    }
}
