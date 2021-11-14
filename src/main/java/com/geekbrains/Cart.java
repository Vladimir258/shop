package com.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Objects;

@Component
@Scope("prototype")
public class Cart {
    private ProductRepository repository;
    private ArrayList<Product> listProduct = new ArrayList<>();

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    void showCart() {
        for (Product p: listProduct) {
            System.out.println(p.toString());
        }
    }

    void addById(Long id) {
        listProduct.add(repository.findById(id));
    }

    void deleteById(Long id) {
        int index = -1;
        for (Product p : listProduct) {
            if (Objects.equals(id, p.getId())) {
                index = listProduct.indexOf(p);
            }
        }
        listProduct.remove(index);


    }
}
