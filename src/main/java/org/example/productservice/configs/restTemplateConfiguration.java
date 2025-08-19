package org.example.productservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class restTemplateConfiguration {
    @Bean
    public RestTemplate getrestTesetmplate(){
        return new RestTemplate();
    }
}
