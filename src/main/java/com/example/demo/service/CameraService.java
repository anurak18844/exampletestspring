package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Camera;
import com.example.demo.repository.CameraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CameraService {
    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCamera(){
        return cameraRepository.findAll();
    }

    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }

    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }
}
