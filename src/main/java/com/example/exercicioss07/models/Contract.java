package com.example.exercicioss07.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Contract {

    @Getter
    private static final List<Contract> contractors = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter
    private Long id;
    private Collector collector;
    private List<Route> routes =new ArrayList<>();

    public Contract(){
        this.setId(sequence++);
    }

    public static Contract addContract(Contract contract){
        contractors.add(contract);
        return contract;
    }

}
