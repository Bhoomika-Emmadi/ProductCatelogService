package com.example.productcatalogservice.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {
    private String name;
    private String description;
    private String imageUrl;
    private Category category;
    private double price;
    private Status status;
    private boolean isPrime;
}
