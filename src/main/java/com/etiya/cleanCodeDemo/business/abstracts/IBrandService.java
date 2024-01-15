package com.etiya.cleanCodeDemo.business.abstracts;

import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import org.springframework.stereotype.Service;

@Service
public interface IBrandService {
    void add(Brand brand);
}
