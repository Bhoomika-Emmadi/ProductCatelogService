package com.example.productcatalogservice.TableInheritanceExamples.SingleTable;

import jakarta.persistence.Entity;

@Entity(name= "st_ta")
public class TA extends User {
    int ratings;
}
