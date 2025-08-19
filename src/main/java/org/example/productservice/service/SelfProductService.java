package org.example.productservice.service;

import org.example.productservice.dtos.CreateProductDto;
import org.example.productservice.exceptions.ProductNotFoundException;
import org.example.productservice.model.Category;
import org.example.productservice.model.Product;
import org.example.productservice.repository.CategoryRepository;
import org.example.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    public SelfProductService(CategoryRepository categoryRepository, ProductRepository productRepository){
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException {
        Product product = productRepository.findById(id);
        if(product == null){
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(String title, double price, String description, String category, String image) {
        Product p = new Product();
        //p.setId(12);
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        p.setImageUrl(image);

        //p.setCreatedAt();

        Category categoryFromDB = categoryRepository.findByTitle(category);

        if(categoryFromDB == null){
            Category newCategory = new Category();
            newCategory.setTitle(category);
            p.setCategory(newCategory);
        }else{
            p.setCategory(categoryFromDB);
        }

        Product createdProduct = productRepository.save(p);


        return createdProduct;

    }
}
