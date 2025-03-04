package com.example.productcatalogservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class SearchDto {
    private String query;
    private int pageSize;
    private int pageNumber;
    private List<SortParam> sortParams;
}
