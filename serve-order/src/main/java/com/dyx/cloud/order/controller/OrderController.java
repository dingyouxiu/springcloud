package com.dyx.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author DYX
 * @version 1.0
 * @description: TODO
 * @date 2022/9/18 19:32
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){

        System.out.println("下单成功，order-server");
        String forObject = restTemplate.getForObject("http://localhost:8000/stock/deduction", String.class);
        System.out.println("调用库存server成功"+forObject);

        return "下单成功，order-server";
    }

}
