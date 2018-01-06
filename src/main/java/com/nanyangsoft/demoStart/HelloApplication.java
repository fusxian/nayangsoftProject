package com.nanyangsoft.demoStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fusxian@gmail.com on 2018/1/6.
 */
@RestController()
@SpringBootApplication
public class HelloApplication {
    public static  void main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
    }

    @RequestMapping(method= RequestMethod.GET,path = "/hello")
    @ResponseBody
    public  String hello(){
        return "hello";
    }
}
