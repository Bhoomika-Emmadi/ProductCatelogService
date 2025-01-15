package com.example.productcatalogservice.repository;

import com.example.productcatalogservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



    Product findProductById(Long id);
    Product save(Product product);

    Product findProductByDescriptionAndAndName(String name, String description);


    @Query("select p.description from Product p where p.id=?1")// Positional Parameters(?)
    String findProductDescriptionById(Long id);

    @Query("SELECT c.name FROM Category c join Product p on p.category.id=c.id where p.id=:pid")// Named Parameters(:)
    String findCategoryNameByProductId(Long pid);




}
