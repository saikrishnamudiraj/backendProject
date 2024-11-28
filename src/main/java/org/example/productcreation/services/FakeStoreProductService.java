package org.example.productcreation.services;

import org.example.productcreation.Dtos.FakeStoreProductDto;
import org.example.productcreation.models.Category;
import org.example.productcreation.models.Product;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    private RestTemplate restTemplate;



    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getSingleProduct(long id) {

        ResponseEntity< FakeStoreProductDto> fakeStoreProductDtoResponseEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);

        if(fakeStoreProductDtoResponseEntity.getStatusCode() != HttpStatusCode.valueOf(200)){
        }

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductDtoResponseEntity.getBody();


        return fakeStoreProductDto.toProduct();
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
