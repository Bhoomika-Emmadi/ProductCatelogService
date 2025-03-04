package com.example.productcatalogservice.services;

import com.example.productcatalogservice.dto.SortParam;
import com.example.productcatalogservice.dto.SortType;
import com.example.productcatalogservice.models.Product;
import com.example.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService implements ISearchService {

    @Autowired
    ProductRepository productRepo;

    @Override
    public Page<Product> search(String query, Integer pageNumber, Integer pageSize, List<SortParam> sortParams) {

//        Sort sort = Sort.by("price").descending().and(Sort.by("id").ascending());
        Sort sort= null;

        if(sortParams.size() != 0){
            if(sortParams.get(0).getSortType().equals(SortType.ASC)){
                sort = sort.by(sortParams.get(0).getSortCriteria());
            }else{

               sort = sort.by(sortParams.get(0).getSortCriteria()).descending();
            }
        }

        for(int i=1;i<sortParams.size();i++){
            if(sortParams.get(i).getSortType().equals(SortType.ASC)){
                sort = sort.and(sort.by(sortParams.get(i).getSortCriteria()));
            }else{
              sort =  sort.and(sort.by(sortParams.get(i).getSortCriteria()).descending());
            }
        }
        if(sort != null) {
            return productRepo.findByName(query, PageRequest.of(pageNumber, pageSize, sort));
        }
        else {
            return productRepo.findByName(query, PageRequest.of(pageNumber, pageSize));
        }


    }
}
