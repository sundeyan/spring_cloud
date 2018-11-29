package com.sun.spring_cloud.Controller;


import com.sun.spring_cloud.Service.OrderService;
import com.sun.spring_cloud.pojo.Item;
import com.sun.spring_cloud.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
 @Autowired
 private OrderService orderService;

    @RequestMapping("/index")
    public Orders index(){
       return orderService.orderShowAll();
    }
}
