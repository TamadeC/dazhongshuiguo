package com.people_fruit.controller;

import com.people_fruit.bean.OrderInfo;
import com.people_fruit.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @PostMapping("order")
    public String order(@RequestBody OrderInfo orderInfo){
        System.out.println(orderInfo);

        return "";
    }
}
