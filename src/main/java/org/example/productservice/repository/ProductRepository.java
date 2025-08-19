package org.example.productservice.repository;

import org.example.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product save(Product product);
    Product findById(long id);

    @Override
    List<Product> findAll();

    //@Query("select p from Product p where p.title = :title and p.price > :price")
    List<Product> findByTitleAndPriceGreaterThan(/*@Param("title")*/ String title, /*@Param("price")*/ double price);


}
