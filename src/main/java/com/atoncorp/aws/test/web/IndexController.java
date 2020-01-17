package com.atoncorp.aws.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
    @RequestMapping("")
    public String home() {
        return "home";
    }

    @RequestMapping("test")
    public String test() {
        return "test";
    }
}
