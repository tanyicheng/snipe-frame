package org.snipe.modules.demo;

import org.snipe.modules.system.SnipeEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {

        SnipeEntity se = new SnipeEntity();
        return "Hello, World!";
    }
}