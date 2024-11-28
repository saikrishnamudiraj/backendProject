package org.example.productcreation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String title;
    private String description;
    private double price;
    private Category category;
    private String imageUrl;
}
