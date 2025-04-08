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
}
