package org.example.productservice;

import org.example.productservice.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {

        Product p = new Product();

        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
