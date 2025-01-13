package com.example.productcatalogservice.models;

import io.micrometer.observation.aop.ObservedAspect;
import jakarta.persistence.Entity;

@Entity
public class TestModel extends BaseModel {

    int numField;
    String nameField;
}
