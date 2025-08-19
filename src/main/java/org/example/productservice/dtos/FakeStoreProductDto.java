package org.example.productservice.dtos;


import lombok.Getter;
import lombok.Setter;
import org.example.productservice.model.Category;
import org.example.productservice.model.Product;

@Getter
@Setter
public class FakeStoreProductDto {
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    public Product toProduct(){
        Product product = new Product();
        product.setId(id);
        product.setName(title);
        product.setDescription(description);
        product.setPrice(price);

        Category category1 = new Category();
        category1.setName(category);
        //product.setCategory(category1);

        return product;
    }
    }
