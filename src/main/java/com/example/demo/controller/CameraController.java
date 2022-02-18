package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import com.example.demo.models.Camera;
import com.example.demo.service.CameraService;
import com.example.demo.service.FactoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    private CameraService cameraService;

    @Autowired
    private FactoryService factoryService;

    @GetMapping("")
    public ResponseEntity<Object> getAllProduct(){
        List<Camera> cameras = cameraService.getCamera();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search OK.!");
        map.put("data", cameras);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> addProduct(@RequestBody Camera camera){

        //ADD EVENT
        // map.put("datacamera", cameraService.addEvent(camera_id, event));
        // CurrentCamera = Fetch Camera By camera_id
        //CurrentFacts = Fetch All Facts
        //forEach(camera of CurrentFacts.camras){
        //    
                // if(camera._id == camera_id){
                    // factoryService.addCamera(id, CurrentCamera)
                // }
        // }
        System.out.print(camera.getFactory_id());

        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Camera OK.!");
    
        map.put("datacamera", cameraService.addCamera(camera));
        map.put("datafactory", factoryService.addCamera(camera.getFactory_id(), camera));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    // @PostMapping("")
}
