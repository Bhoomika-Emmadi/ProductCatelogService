package com.example.productcatalogservice.TableInheritanceExamples.MappedSuperClass;

import jakarta.persistence.*;

@MappedSuperclass
public class User {
    @Id
    Long id;
    String email;
}
