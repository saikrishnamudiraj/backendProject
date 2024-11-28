package org.example.productservice.services;

import org.example.productservice.models.Category;
import org.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
     Product getSingleProduct(long id);
     List<Product> getAllProducts();
     Product createProduct(String title,
                           String description,
                           double price,
                           Category category,
                           String imageUrl);

}
