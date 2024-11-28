package org.example.productcreation.services;

import org.example.productcreation.models.Category;
import org.example.productcreation.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class selfProductService implements ProductService {


    @Override
    public Product getSingleProduct(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, String description, double price, Category category, String imageUrl) {
        return null;
    }
}
