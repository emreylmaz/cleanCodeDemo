package com.etiya.cleanCodeDemo.business.messages;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelBusinessMessages {
    public static final String MAX_BRAND_EXIST = "Brand limit excedeed";
}