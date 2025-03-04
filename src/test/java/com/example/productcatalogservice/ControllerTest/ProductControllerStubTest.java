package com.example.productcatalogservice.ControllerTest;

import com.example.productcatalogservice.controllers.ProductController;
import com.example.productcatalogservice.dto.ProductDto;
import com.example.productcatalogservice.models.Product;
import com.example.productcatalogservice.services.FakeStoreProductService;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


public class ProductControllerStubTest {

    @Mock
    FakeStoreProductService productService;

    @InjectMocks
    ProductController productController;

    @Test
    public void TestgetProductById_runsSuccessfully() {

        MockitoAnnotations.openMocks(this);
        //Arrange
        Product product = new Product();
        product.setId(1L);
        product.setName("Iphone");
        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName("Iphone");
        when(productService.getProductById(anyLong())).thenReturn(product);

        //act
        ResponseEntity<ProductDto> response = productController.getProductById(1L);

        //assert
        assertNotNull(response);
        assertEquals(1L, response.getBody().getId());
        assertEquals(1L, response.getBody().getId());
        verify(productService,times(1)).getProductById(anyLong());

    }
}
