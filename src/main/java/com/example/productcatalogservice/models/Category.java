package com.example.productcatalogservice.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel{
    private String name;
    private String description;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY) // fetch type: eager, lazy
//    @Fetch(FetchMode.JOIN) // fetch mode: select, join, subselect for more refere to Fetch-Type-Mode-Results file in the same proj location
//    @BatchSize(size = 2)
    @JsonBackReference
    private List<Product> products;
}
