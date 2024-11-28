package org.example.productservice.Dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productservice.models.Category;

@Getter
@Setter
public class CreateProductRequest {
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageUrl;
}
