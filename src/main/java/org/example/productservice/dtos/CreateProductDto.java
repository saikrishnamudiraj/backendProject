package org.example.productservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateProductDto {
    //private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageUrl;

    public CreateProductDto(String title, double price, String description, String category, String image) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.imageUrl = image;
    }

}
