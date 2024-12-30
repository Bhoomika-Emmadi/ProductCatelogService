package com.example.productcatalogservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String category;
    private String image;

}
