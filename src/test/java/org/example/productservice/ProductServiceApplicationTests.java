package org.example.productservice;

import org.example.productservice.model.Product;
import org.example.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testProductRepository(){
        List<Product> p = productRepository.findByTitleAndPriceGreaterThan("apple", 100.0);
        System.out.println(p);
    }

}
