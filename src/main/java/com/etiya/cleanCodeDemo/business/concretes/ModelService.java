package com.etiya.cleanCodeDemo.business.concretes;

import com.etiya.cleanCodeDemo.business.abstracts.IModelService;
import com.etiya.cleanCodeDemo.business.rules.ModelBusinessRules;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.ModelRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelService implements IModelService {

    private ModelRepository modelRepository;

    private ModelBusinessRules modelBusinessRules;

    @Override
    public void add(Model model) {
        modelBusinessRules.checkIfBrandInModelMaxLimitExceeded(model.getBrand());
        modelRepository.save(model);
    }
}
