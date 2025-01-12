package com.example.productcatalogservice.TableInheritanceExamples.SingleTable;


import jakarta.persistence.Entity;

@Entity(name = "st_mentor")
public class Mentor extends User {
    int noOfHours;
}
