package com.etiya.cleanCodeDemo.business.rules;

import com.etiya.cleanCodeDemo.business.messages.BrandBusinessMessages;
import com.etiya.cleanCodeDemo.core.utilites.exceptions.types.BusinessException;
import com.etiya.cleanCodeDemo.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    private BrandBusinessMessages brandBusinessMessages;

    public void checkIfBrandAlreadyExist(String brandName) {
        if (brandRepository.existsByName(brandName)) {
            throw new BusinessException(BrandBusinessMessages.ALREADY_BRAND_EXIST);
        }
    }
}
