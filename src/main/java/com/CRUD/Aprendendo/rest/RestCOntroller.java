package com.CRUD.Aprendendo.rest;

import org.springframework.web.bind.annotation.GetMapping;

public class RestCOntroller {

    // expose "/" that return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

}
