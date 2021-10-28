package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundo {
    @RequestMapping("/usuario")
    public String hola(){
      return "Hola mundo!";
    }
}
