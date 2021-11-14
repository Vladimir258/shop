package com.geekbrains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrderFromProduct(1L);
        orderService.createOrderFromProduct(2L);
        orderService.createOrderFromProduct(3L);
        orderService.createOrderFromProduct(4L);
        orderService.createOrderFromProduct(5L);
        context.close();
    }
}
