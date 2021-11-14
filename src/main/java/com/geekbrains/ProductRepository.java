package com.geekbrains;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository {
    Product findById(Long id);

    List<Product> findAll();
}
