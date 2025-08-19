package org.example.productservice.service;

import org.example.productservice.dtos.CreateProductDto;
import org.example.productservice.exceptions.ProductNotFoundException;
import org.example.productservice.model.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(long id) throws ProductNotFoundException;
    public List<Product> getAllProducts();
    public Product createProduct(String title, double price, String description, String category, String image);
}
