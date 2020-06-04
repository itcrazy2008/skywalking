package com.itcrazy2008.skywalking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SkywalkingConfig {
  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
