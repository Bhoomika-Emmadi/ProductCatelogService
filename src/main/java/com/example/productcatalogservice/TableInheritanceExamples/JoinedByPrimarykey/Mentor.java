package com.example.productcatalogservice.TableInheritanceExamples.JoinedByPrimarykey;


import jakarta.persistence.Entity;

@Entity(name = "jc_mentor")
public class Mentor extends User {
    int noOfHours;
}
