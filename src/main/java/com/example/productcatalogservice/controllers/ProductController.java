package com.example.productcatalogservice.controllers;



import com.example.productcatalogservice.dto.ProductDto;
import com.example.productcatalogservice.models.Product;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

// we need /getAllProducts, /getProductById, / createProduct, /deleteProduct

    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        System.out.println("getProducts");
        Product product = new Product();
        product.setId(1L);
        product.setDescription("this isn the 1st prod description");
        product.setName("Fist Product");
        List<Product> products = new ArrayList<>();
        products.add(product);


        return null;
    }

    @GetMapping("/products/{id}")
    public ProductDto getProductById(@PathVariable Long id){ //also try with @QueryParam
        System.out.println("getProductById");
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setDescription("this isn the 1st prod description");
        productDto.setName("Fist Product");

        return productDto;
    }

    @PostMapping("/products")
    public ProductDto createProduct(@RequestBody ProductDto productDto){


        return productDto;
    }

}
