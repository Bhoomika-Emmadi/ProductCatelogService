package com.example.productcatalogservice.repository;

import com.example.productcatalogservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//    @Query("select * from Product where id=?")
//    Product findbyId(Long id);
//    Product save(Product product);

//    Product updateByProductId(Long id, Product product);
}
