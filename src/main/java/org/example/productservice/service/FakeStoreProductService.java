package org.example.productservice.service;

import org.example.productservice.dtos.FakeStoreProductDto;
import org.example.productservice.dtos.CreateProductDto;
import org.example.productservice.exceptions.ProductNotFoundException;
import org.example.productservice.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException {
        ResponseEntity<FakeStoreProductDto> productResponce = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);

        FakeStoreProductDto fakeStoreProductDto = productResponce.getBody();

        if(fakeStoreProductDto == null){
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }

        return fakeStoreProductDto.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] fakeStoreProduct =
                restTemplate.getForObject("https://fakestoreapi.com/products",
                        FakeStoreProductDto[].class);

        List<Product> products = new ArrayList<>();
       for(FakeStoreProductDto product : fakeStoreProduct){
           products.add(product.toProduct());
       }
        return products;
    }

    @Override
    public Product createProduct(String title, double price, String description, String category, String image) {
        CreateProductDto createProductDto = new CreateProductDto();
        createProductDto.setTitle(title);
        createProductDto.setPrice(price);
        createProductDto.setDescription(description);
        createProductDto.setCategory(category);
        createProductDto.setImage(image);

        FakeStoreProductDto fakeStoreProductDto = restTemplate.postForObject(
                "https://fakestoreapi.com/products", createProductDto, FakeStoreProductDto.class);

        return fakeStoreProductDto.toProduct();
    }
}
