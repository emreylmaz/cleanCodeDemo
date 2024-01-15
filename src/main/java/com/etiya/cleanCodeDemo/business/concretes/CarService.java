package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.IBrandService;
import com.etiya.cleanCodeDemo.business.abstracts.ICarService;
import com.etiya.cleanCodeDemo.business.abstracts.IFuelService;
import com.etiya.cleanCodeDemo.business.abstracts.IModelService;
import com.etiya.cleanCodeDemo.business.abstracts.ITransmissionService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.CarRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService implements ICarService {

    private CarRepository carRepository;
    private IBrandService brandService;
    private IModelService modelService;
    private IFuelService fuelService;
    private ITransmissionService transmissionService;

    public CarService(CarRepository carRepository, IBrandService brandService, IModelService modelService, IFuelService fuelService, ITransmissionService transmissionService) {
        this.carRepository = carRepository;
        this.brandService = brandService;
        this.modelService = modelService;
        this.fuelService = fuelService;
        this.transmissionService = transmissionService;
    }

    @Override
    public void add(Car car) {


    }
}
