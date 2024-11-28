package org.example.productcreation.services;

import org.example.productcreation.models.Category;
import org.example.productcreation.models.Product;

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
