package com.sun.spring_cloud.Service;

import com.sun.spring_cloud.pojo.Item;
import com.sun.spring_cloud.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {
    
    private static final Map<Long,Orders> map=new HashMap<Long,Orders>();
       static {
           Orders od=new Orders();
           od.setOname("订单");
           od.setOid(1L);
           Item it=new Item();
           it.setId(1L);
           od.setItem(it);
           map.put(110L,od);
       }
    @Autowired
    private ItemService itemService;
       public Orders orderShowAll(){

           Orders orders=map.get(110L);
            Item item=itemService.showone(orders.getItem().getId());
            orders.setItem(item);
           return orders;
       }
}
