package org.example.productcreation;

import org.example.productcreation.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductCreationApplication {
	Product product = new Product();

	public static void main(String[] args) {
		SpringApplication.run(ProductCreationApplication.class, args);
	}

}
