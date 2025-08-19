package org.example.productservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BasModel{
    //private int id;
    private String title;

    @OneToMany(mappedBy = "category",cascade = CascadeType.REMOVE)
            @JsonIgnore
    List<Product> products;
}
