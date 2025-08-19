package org.example.productservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends BasModel {
   // private int id;
    private String title;
    private String description;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Category category;
    private double price;
    private String imageUrl;

}
