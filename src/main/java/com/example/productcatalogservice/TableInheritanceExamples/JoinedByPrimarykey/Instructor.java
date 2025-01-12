package com.example.productcatalogservice.TableInheritanceExamples.JoinedByPrimarykey;


import jakarta.persistence.Entity;

@Entity(name= "jc_instructor")
public class Instructor extends User {
    String CompanyName;
}

