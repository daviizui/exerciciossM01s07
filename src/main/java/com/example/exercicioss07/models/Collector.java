package com.example.exercicioss07.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Collector {

    @Getter
    private static final List<Collector> collectors = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter
    private Long id;
    private String name;
    private String description;

    public Collector(){
        this.setId(sequence++);
    }

    public static Collector addCollector(Collector collector){
        collectors.add(collector);
        return collector;
    }
}
