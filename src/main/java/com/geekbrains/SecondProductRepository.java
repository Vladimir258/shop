package com.geekbrains;

public class SecondProductRepository implements ProductRepository {

    @Override
    public Product findById(Long id) {
        throw new UnsupportedOperationException();
    }
}
