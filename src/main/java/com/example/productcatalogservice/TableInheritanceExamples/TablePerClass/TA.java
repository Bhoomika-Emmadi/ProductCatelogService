package com.example.productcatalogservice.TableInheritanceExamples.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name= "tpc_ta")
public class TA extends User {
    int ratings;
}
