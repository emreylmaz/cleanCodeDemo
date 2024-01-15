package com.etiya.cleanCodeDemo.business.messages;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessMessages {
    public static final String ALREADY_BRAND_EXIST = "Brand already exist";
}
