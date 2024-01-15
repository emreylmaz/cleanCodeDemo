package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.IBrandService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.BrandRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BrandService implements IBrandService {

    private BrandRepository brandRepository;

    @Override
    public void add(Brand brand) {
        brandRepository.save(brand);
    }
}
