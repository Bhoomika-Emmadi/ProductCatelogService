package com.example.productcatalogservice.repository;

import com.example.productcatalogservice.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductRepoTest {

    @Autowired
    private ProductRepository productRepo;

    //1.In AWS we have created and EC2(Elastic Cloud Compute) instance and tested one sample Python Application,
    // we didn't go witht eh Springboot app because in Ec2 as its a basic system we need to install java, jdk, springboot to run springboot app
    // to save time and charges we went with basic Py application
    //2. Next we built RDS(Relational Database Service) which is the a db in cloud
    // and tried connecting our product service to the remote RDS
    //3.We have Built an EBS(Elastic Bean Stalk) in which we tried deploying the productCatalogService application
    // and tested the get endpoints.EBS acts like a Personalised Assistant which take care of monitoring the Load,
    //scaling up and down based on the incoming requests, Faster deployments.
    //4.Route 53 acts as DNS if we have a public domain we can register those domain along with the productCatalogservicedomain in Route53 ,
    //for easier access over the browser by the end user.

    // This is the sample test to load data into the aws db(RDS-Relational DataBase service)

    @Test
    public void TestProductDbLoader(){

        Product product = new Product();
        product.setId(10L);
        product.setName("Iphone");
        productRepo.save(product);
        Product product2 = new Product();
        product2.setId(20L);
        product2.setName("Iphone2");
        productRepo.save(product2);
    }
}
