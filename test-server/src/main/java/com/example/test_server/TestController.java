package com.example.test_server;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

@GetMapping("/hello")
    public String sayHello(@RequestParam("name") String n){

    String rs = "Hello " + n + " !";
    return rs;


}
}
