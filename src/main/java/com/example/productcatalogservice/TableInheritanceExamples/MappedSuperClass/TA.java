package com.example.productcatalogservice.TableInheritanceExamples.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name= "msc_ta")
public class TA extends User {
    int ratings;
}
