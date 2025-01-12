package com.example.productcatalogservice.TableInheritanceExamples.MappedSuperClass;


import jakarta.persistence.Entity;

@Entity(name= "msc_instructor")
public class Instructor extends User {
    String CompanyName;
}

