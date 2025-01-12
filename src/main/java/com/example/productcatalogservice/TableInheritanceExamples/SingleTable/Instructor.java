package com.example.productcatalogservice.TableInheritanceExamples.SingleTable;


import jakarta.persistence.Entity;

@Entity(name= "st_instructor")
public class Instructor extends User {
    String CompanyName;
}

