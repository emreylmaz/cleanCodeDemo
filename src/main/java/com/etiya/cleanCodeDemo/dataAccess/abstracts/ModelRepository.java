package com.etiya.cleanCodeDemo.dataAccess.abstracts;

import com.etiya.cleanCodeDemo.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
