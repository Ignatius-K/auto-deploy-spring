package com.tutorial.basic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b/api")
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "hello to the world";
    }

    @GetMapping("/{id}")
    public String printNumber(@PathVariable String id) {
        System.out.println("testing out path .......................");
        return id;
    }
}
