package edu.school.hei.prog3__springtd2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String welcome(@RequestParam String name){
        String template = "Welcome %s";
        return (template.formatted(name));
    }
}
