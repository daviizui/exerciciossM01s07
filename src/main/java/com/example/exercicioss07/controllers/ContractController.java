package com.example.exercicioss07.controllers;

import com.example.exercicioss07.models.Contract;
import com.example.exercicioss07.seveces.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @PostMapping
    public Contract post(@RequestBody Contract contract){
        return contractService.create(contract);
    }

    @GetMapping
    public List<Contract> get(){
        return contractService.findAll();
    }
}
