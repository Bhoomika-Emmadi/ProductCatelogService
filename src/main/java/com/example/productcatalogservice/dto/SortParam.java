package com.example.productcatalogservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class SortParam {
    private SortType sortType;
    private String sortCriteria;
}
