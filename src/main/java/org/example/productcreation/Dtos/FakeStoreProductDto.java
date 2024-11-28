package org.example.productcreation.Dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productcreation.models.Category;
import org.example.productcreation.models.Product;

@Getter
@Setter
public class FakeStoreProductDto {
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageUrl;

    public Product toProduct() {
        Product product = new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);

        Category cat = new Category();
        cat.setTitle(category);

        product.setImageUrl(imageUrl);
        return product;
    }

}
