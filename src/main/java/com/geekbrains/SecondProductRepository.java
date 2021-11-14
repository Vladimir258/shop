package com.geekbrains;

import java.util.List;

public class SecondProductRepository implements ProductRepository {

    @Override
    public Product findById(Long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Product> findAll() {
        throw new UnsupportedOperationException();
    }
}
