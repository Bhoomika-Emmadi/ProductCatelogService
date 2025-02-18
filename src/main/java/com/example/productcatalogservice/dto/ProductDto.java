package com.example.productcatalogservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {
    private long id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private CategoryDto category;
    private String message;
}
