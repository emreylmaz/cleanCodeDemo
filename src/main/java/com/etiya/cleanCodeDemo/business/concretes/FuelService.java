package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.IFuelService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.FuelRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Fuel;
import org.springframework.stereotype.Service;

@Service
public class FuelService implements IFuelService {

    private FuelRepository fuelRepository;

    @Override
    public void add(Fuel fuel) {
        fuelRepository.save(fuel);
    }
}
