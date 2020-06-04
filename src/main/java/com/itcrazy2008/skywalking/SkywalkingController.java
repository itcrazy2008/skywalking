package com.itcrazy2008.skywalking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SkywalkingController {

  @Autowired
  RestTemplate restTemplate;

  @GetMapping(path="/hello")
  @ResponseBody
  public String hello(){
    System.out.println("Hello Skywalking....");
    return "Hello Skywalking....";
  }

  @GetMapping(path="/chain")
  @ResponseBody
  public String chain(){
    //模拟接口或服务调用
    System.out.println("chain Skywalking....");
    restTemplate.getForObject("http://localhost:8080/hello",String.class);
    return "chain Skywalking....";
  }
}
