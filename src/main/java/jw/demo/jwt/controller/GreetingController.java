package jw.demo.jwt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(path = "/greeting")
    public String greeting(@RequestParam String name) {
        return "Hello " + name;
    }
}
