package com.example.exercicioss07.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Collector {

    @Getter
    private static Long sequence = 1L;

    @Setter
    private Long id;
    private String name;
    private String description;

    public Collector(){
        this.setId(sequence++);
    }
}
