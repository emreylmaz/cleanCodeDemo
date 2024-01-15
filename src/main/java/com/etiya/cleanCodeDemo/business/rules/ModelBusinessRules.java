package com.etiya.cleanCodeDemo.business.rules;

import com.etiya.cleanCodeDemo.business.messages.ModelBusinessMessages;
import com.etiya.cleanCodeDemo.core.utilites.exceptions.types.BusinessException;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.ModelRepository;
import com.etiya.cleanCodeDemo.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class ModelBusinessRules {
    private ModelRepository modelRepository;
    private ModelBusinessMessages modelBusinessMessages;

    public void checkIfBrandInModelMaxLimitExceeded(Brand brand) {
        int countOfBrandInModel = modelRepository.countAllByBrand(brand);
        if (countOfBrandInModel >= 5) {
            throw new BusinessException(modelBusinessMessages.MAX_BRAND_EXIST);
        }
    }
}
