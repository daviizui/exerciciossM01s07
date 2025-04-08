package com.example.exercicioss07.seveces;

import com.example.exercicioss07.models.Route;
import com.example.exercicioss07.models.Route;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouterService {

    public Route save(Route route){
        Route.addRoute(route);
        return route;
    }

    public List<Route> findAll(){
        return Route.getRoutes();
    }
    public Route findById(Long id){
        for (Route collector : Route.getRoutes()){
            if (collector.getId().equals(id)){
                return collector;
            }
        }
        return null;
    }


}
