package com.example.exercicioss07.controllers;


import com.example.exercicioss07.models.Collector;
import com.example.exercicioss07.seveces.CollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("collectors")
@RestController
public class CollectorController {

    @Autowired
    private CollectorService service;

    @GetMapping
    public List<Collector> get(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Collector post(@RequestBody Collector collector){
        return service.save(collector);
    }
}
