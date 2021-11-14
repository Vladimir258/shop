package com.geekbrains;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class BotService {
    void useCart(Cart cart) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m1 :
        {
            while (true) {
                String[] cmd = br.readLine().split(" ");
                switch (cmd[0]) {
                    case "add":
                        cart.addById(Long.parseLong(cmd[1]));
                        break;
                    case "show":
                        cart.showCart();
                        break;
                    case "remove":
                        cart.deleteById(Long.parseLong(cmd[1]));
                        break;
                    case "exit":
                        break m1;
                    default:
                        break;
                }
            }
        }
    }
}
