package org.example.productservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Category {
    private String title;
    private List<Product> products;
}
