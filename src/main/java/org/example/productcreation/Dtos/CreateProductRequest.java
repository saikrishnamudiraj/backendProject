package org.example.productcreation.Dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productcreation.models.Category;

@Getter
@Setter
public class CreateProductRequest {
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageUrl;
}
