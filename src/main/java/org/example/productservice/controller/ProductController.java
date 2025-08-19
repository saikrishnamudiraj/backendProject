package org.example.productservice.controller;

import org.example.productservice.dtos.CreateProductDto;
import org.example.productservice.exceptions.ProductNotFoundException;
import org.example.productservice.model.Product;
import org.example.productservice.service.ProductService;
import org.example.productservice.service.SelfProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    public ProductService productService;


    public ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("id") long id) throws ProductNotFoundException {

        Product p = productService.getSingleProduct(id);
        ResponseEntity<Product> responseEntity;
        if(p == null){
            responseEntity = new ResponseEntity<>(p, HttpStatus.NOT_FOUND);
        }else{
            responseEntity = new ResponseEntity<>(p, HttpStatus.OK);
        }

        return responseEntity;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public Product createNewProduct(@RequestBody CreateProductDto createProductDto){
        Product product = productService.createProduct(createProductDto.getTitle(),
                createProductDto.getPrice(),
                createProductDto.getDescription(),
                createProductDto.getCategory(),
                createProductDto.getImageUrl());
        return product;
    }
}
