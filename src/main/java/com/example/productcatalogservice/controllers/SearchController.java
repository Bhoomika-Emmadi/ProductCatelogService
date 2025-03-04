package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.dto.SearchDto;
import com.example.productcatalogservice.models.Product;
import com.example.productcatalogservice.services.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    ISearchService searchService;

    @PostMapping
    Page<Product> searchProducts(@RequestBody SearchDto searchDto) {

        return searchService.search(searchDto.getQuery(), searchDto.getPageNumber(),searchDto.getPageSize(), searchDto.getSortParams());
    }
}
