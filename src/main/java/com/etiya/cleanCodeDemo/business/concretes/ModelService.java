package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.IModelService;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.ModelRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Model;
import org.springframework.stereotype.Service;

@Service
public class ModelService implements IModelService {

    private ModelRepository modelRepository;

    @Override
    public void add(Model model) {
        modelRepository.save(model);
    }
}
