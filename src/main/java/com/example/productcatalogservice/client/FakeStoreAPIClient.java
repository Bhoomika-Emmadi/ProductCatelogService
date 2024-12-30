package com.example.productcatalogservice.client;
import com.example.productcatalogservice.dto.FakeStoreProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class FakeStoreAPIClient {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Value("${fakeStore.url}")
    private String fakeStoreURL;

    //get
    public FakeStoreProductDto[] getProducts() {
        ResponseEntity<FakeStoreProductDto[]> responseEntity = requestForEntity(fakeStoreURL,HttpMethod.GET, null, FakeStoreProductDto[].class, "");
        return validationForArray(responseEntity);
    }

    //get
    public FakeStoreProductDto getProductById(Long id){
        ResponseEntity<FakeStoreProductDto> responseEntity = requestForEntity(fakeStoreURL+"/{id}",HttpMethod.GET, null, FakeStoreProductDto.class, id);
        return validation(responseEntity);
    }
    //post
    public FakeStoreProductDto createProduct( FakeStoreProductDto fakeStoreProductDto){
        ResponseEntity<FakeStoreProductDto> responseEntity = requestForEntity(fakeStoreURL,HttpMethod.POST, fakeStoreProductDto, FakeStoreProductDto.class, "");
        return validation(responseEntity);
    }
    //delete
    public FakeStoreProductDto deleteProduct(Long productId){
        ResponseEntity<FakeStoreProductDto> responseEntity = requestForEntity(fakeStoreURL+"/{id}",HttpMethod.DELETE, null, FakeStoreProductDto.class, productId);
        return validation(responseEntity);
    }

    //put
    public FakeStoreProductDto replaceProduct(Long productId,  FakeStoreProductDto fakeStoreProductDto) {
        ResponseEntity<FakeStoreProductDto> responseEntity = requestForEntity(fakeStoreURL+"/{id}",HttpMethod.PUT, fakeStoreProductDto, FakeStoreProductDto.class, productId);
        return validation(responseEntity);
    }

    public <T> ResponseEntity<T> requestForEntity(String url, HttpMethod httpMethod, @Nullable Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        RestTemplate restTemplate =restTemplateBuilder.build();
        RequestCallback requestCallback = restTemplate.httpEntityCallback(request, responseType);
        ResponseExtractor<ResponseEntity<T>> responseExtractor = restTemplate.responseEntityExtractor(responseType);
        return restTemplate.execute(url, httpMethod, requestCallback, responseExtractor, uriVariables);
    }

    public FakeStoreProductDto[] validationForArray(ResponseEntity<FakeStoreProductDto[]> response){
        if(response.getBody() == null || response.getStatusCode().equals(HttpStatusCode.valueOf(500))){
            return null;
        }
        return response.getBody();
    }

    public FakeStoreProductDto validation(ResponseEntity<FakeStoreProductDto> response){
        if(response.getBody() == null || response.getStatusCode().equals(HttpStatusCode.valueOf(500))){
            return null;
        }
        return response.getBody();
    }


}
