package org.abhi.worldtime.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WorldTimeConfig {

    @Bean
    public RestTemplate restTemplate(){
        //add more config if needed
        return new RestTemplate();
    }
}
