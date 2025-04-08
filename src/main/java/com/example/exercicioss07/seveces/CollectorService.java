package com.example.exercicioss07.seveces;

import com.example.exercicioss07.models.Collector;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectorService {
    
    public Collector save(Collector collector){
        Collector.addCollector(collector);
        return collector;
    }
    
    public List<Collector> findAll(){
        return Collector.getCollectors();
    }

    public Collector findById(Long id){
        for (Collector collector : Collector.getCollectors()){
            if (collector.getId().equals(id)){
                return collector;
            }
        }
        return null;
    }
}
