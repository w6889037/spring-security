package com.huxc.authorization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @PostMapping("/login")
    public String login() {

        return "success";
    }
}
