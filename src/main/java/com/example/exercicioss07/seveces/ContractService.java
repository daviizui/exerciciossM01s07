package com.example.exercicioss07.seveces;

import com.example.exercicioss07.models.Collector;
import com.example.exercicioss07.models.Contract;
import com.example.exercicioss07.models.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ContractService {

    @Autowired
    private RouterService routerService;
    @Autowired
    private CollectorService collectorService;


    public List<Contract> findAll(){
        return Contract.getContractors();
    }

    public Contract create(Contract contract){
        Collector collector = collectorService.findById(contract.getCollector().getId());
        if (collector == null){return null;}
        else{contract.setCollector(collector);}

        List<Route> routes = new ArrayList<>();
        for (Route route : contract.getRoutes()){
            Route foundRoute = routerService.findById(route.getId());
            if (foundRoute == null){return  null;}
            else {routes.add(foundRoute);}
        }
            contract.setRoutes(routes);
        return Contract.addContract(contract);

    }
}
