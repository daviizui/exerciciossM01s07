package com.example.exercicioss07.models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Route {

    @Getter
    private static final List<Route> routes = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter
    private Long id;
    private String description;
    private String coveragerArea;
    private BigDecimal percentualEficiencia;

    public Route(){
        this.setId(sequence++);
    }

    public Route(String description, String coveragerArea, BigDecimal percentualEficiencia) {
    }


    public static Route addRoute (Route route){
        routes.add(route);
        return route;
    }


}
