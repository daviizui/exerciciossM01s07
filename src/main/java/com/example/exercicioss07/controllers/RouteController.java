package com.example.exercicioss07.controllers;


import com.example.exercicioss07.models.Route;
import com.example.exercicioss07.seveces.RouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("routes")
@RestController
public class RouteController {

    @Autowired
    private RouterService service;

    @GetMapping
    public List<Route> get(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Route post(@RequestBody Route route){
        return service.save(route);
    }
}
