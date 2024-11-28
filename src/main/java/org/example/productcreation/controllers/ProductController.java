package org.example.productcreation.controllers;

import org.example.productcreation.models.Product;
import org.example.productcreation.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping( "/product/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable ("id") long id) {
        Product p = productService.getSingleProduct(id);
        ResponseEntity<Product> responseEntity;
        if(p == null){
            responseEntity = new ResponseEntity<>(p, HttpStatus.NOT_FOUND);
        }else{
            responseEntity = new ResponseEntity<>(p, HttpStatus.OK);
        }



        return responseEntity;
    }

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return null;
    }
}
