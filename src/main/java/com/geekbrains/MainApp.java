package com.geekbrains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

        BotService botService = new BotService();
        Cart cart1 = context.getBean(Cart.class);
        cart1.showCart();
        cart1.addById(3L);
        cart1.addById(1L);
        cart1.showCart();
        cart1.deleteById(1L);
        cart1.showCart();

        Cart cart2 = context.getBean(Cart.class);
        botService.useCart(cart2);
        context.close();

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.createOrderFromProduct(1L);
//        orderService.createOrderFromProduct(2L);
//        orderService.createOrderFromProduct(3L);
//        orderService.createOrderFromProduct(4L);
//        orderService.createOrderFromProduct(5L);
//        context.close();
    }
}
