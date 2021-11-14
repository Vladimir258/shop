package com.geekbrains;

import org.springframework.stereotype.Component;

@Component
public interface ProductRepository {
    Product findById(Long id);
}
