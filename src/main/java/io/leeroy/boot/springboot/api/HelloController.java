package io.leeroy.boot.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, Boot Spring Boot!!";
    }
}
