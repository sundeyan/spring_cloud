package com.sun.spring_cloud.Service;


import com.sun.spring_cloud.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ItemService {
   @Autowired
  private RestTemplate restTemplate;


public Item showone(Long id){
int a=1;
    return this.restTemplate.getForObject("http://localhost:8010/item/"+id,Item.class);
}

}
