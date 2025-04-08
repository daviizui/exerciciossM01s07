package com.example.exercicioss07.models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Route {

    @Getter
    private static Long sequence = 1L;

    @Setter
    private Long id;
    private String description;
    private String coveragerArea;
    private BigDecimal percentualEficiencia;

    public Route(){
        this.setId(sequence++);
    }


}
