package com.example.productcatalogservice.TableInheritanceExamples.JoinedByPrimarykey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name= "jc_user")
public class User {
    @Id
    Long id;
    String email;
}
