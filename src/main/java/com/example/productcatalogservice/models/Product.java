package com.example.productcatalogservice.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product extends BaseModel {
    private String name;
    private String description;
    private String imageUrl;
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
    private double price;
    private Status status;
    private boolean isPrime;
}
