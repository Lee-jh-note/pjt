package org.example.pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "main";
    }
}
