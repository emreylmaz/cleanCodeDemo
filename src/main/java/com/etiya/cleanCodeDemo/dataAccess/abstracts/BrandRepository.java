package com.etiya.cleanCodeDemo.dataAccess.abstracts;

import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
