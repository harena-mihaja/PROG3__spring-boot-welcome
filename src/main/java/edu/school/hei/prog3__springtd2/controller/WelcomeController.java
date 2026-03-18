package edu.school.hei.prog3__springtd2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcome(@RequestParam String name){
        String template = "Welcome %s";
        if (name == null || name.isEmpty())
            return (ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(null));
        return (ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type", "text/plain")
                .body(template.formatted(name)));
    }
}
