package com.firstapi.rest.webservices.restfulwebservices.helloworld;

import com.firstapi.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
    // GET method
    // URI - /hello-world
    // Map the GET URI to this controller
    // @RequestMapping(method= RequestMethod.GET, path="/hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    // return a bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World")  ;
    }
    @GetMapping(path="/hello-world/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name))  ;
    }

}
