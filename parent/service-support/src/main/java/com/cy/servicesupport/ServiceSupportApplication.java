package com.cy.servicesupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSupportApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(ServiceSupportApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
