package com.example.productcatalogservice.TableInheritanceExamples.JoinedByPrimarykey;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jc_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    int noOfHours;
}
