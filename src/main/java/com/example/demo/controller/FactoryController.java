package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import com.example.demo.models.Factory;
import com.example.demo.service.FactoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {
    @Autowired
    private FactoryService factoryService;

    @GetMapping("")
    public ResponseEntity<Object> getFactories(){
        List<Factory> factories = factoryService.getFactories();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search OK.!");
        map.put("data", factories);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
    
    @PostMapping("")
    public ResponseEntity<Object> addProduct(@RequestBody Factory factory){
        System.out.print(factory.getName());
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add OK.!");
        map.put("data", factoryService.addFactory(factory));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
    
}
