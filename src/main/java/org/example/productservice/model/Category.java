package org.example.productservice.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category extends BasModel{
    //private int id;
    private String name;
    private String description;
}
