package com.example.productcatalogservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private long id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private CategoryDto category;
    private String message;
}
