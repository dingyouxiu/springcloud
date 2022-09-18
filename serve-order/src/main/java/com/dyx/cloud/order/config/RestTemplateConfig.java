package com.dyx.cloud.order.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author DYX
 * @version 1.0
 * @description: TODO
 * @date 2022/9/18 19:47
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 远程调用配置类
     * @return
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        RestTemplate restTemplate = restTemplateBuilder.build();
        return restTemplate;
    }

}
