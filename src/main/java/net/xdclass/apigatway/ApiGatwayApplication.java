package net.xdclass.apigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatwayApplication.class, args);
    }

}

