package com.dyx.cloud.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

/**
 * @author DYX
 * @version 1.0
 * @description: TODO
 * @date 2022/9/18 19:32
 */

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/deduction")
    public String deduction(){

        System.out.println("扣减库存，stock-server");

        return "扣减库存，stock-server";
    }

}
