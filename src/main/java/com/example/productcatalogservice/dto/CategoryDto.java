package com.example.productcatalogservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto {

    private long id;
    private String name;
    private String description;
//    private List<ProductDto> products;
}
