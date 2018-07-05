package com.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @className: HelloService
 * @package: com.cloud.service
 * @describe:
 * @auther: liuzhiyong
 * @date: 2018/7/5
 * @time: 上午 10:27
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String home(String name){

        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=" + name,String.class);
    }
}
