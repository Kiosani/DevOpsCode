package com.kravchenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PayPalExample {

    public static void main(String[] args) {
        SpringApplication.run(PayPalExample.class, args);
    }

}
