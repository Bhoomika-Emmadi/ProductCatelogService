package com.example.productcatalogservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {


    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hi", "Hello", "World","Hi", "Hello", "World");

        str.stream().map(String::toLowerCase).collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
