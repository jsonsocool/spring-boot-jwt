package jw.demo.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    @PostMapping(path = "/signin")
    public String signIn(String username, String password) {
        return "ok";
    }

}
