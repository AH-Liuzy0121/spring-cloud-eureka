package com.cloud.controller;

import com.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloController
 * @package: com.cloud.controller
 * @describe:
 * @auther: liuzhiyong
 * @date: 2018/7/5
 * @time: 上午 10:32
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String home(@RequestParam String name){

        return helloService.home(name);
    }
}
