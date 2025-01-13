package com.example.productcatalogservice.TableInheritanceExamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jdk.jfr.Description;

@Entity(name= "st_ta")
@DiscriminatorValue(value = "1")
public class TA extends User {
    int ratings;
}
