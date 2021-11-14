package com.geekbrains;

import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class OrderService {
    private ProductService productService;
    private FileOutputStream fileOut;

    public OrderService(ProductService productService, FileOutputStream filOut) {
        this.productService = productService;
        this.fileOut = filOut;
    }

    public void createOrderFromProduct(Long productId) {
        System.out.println("Заказ создан: ");
        System.out.println(productService.getTitleById(productId));
        try {
            fileOut.write("Ready\n".getBytes());
            fileOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
