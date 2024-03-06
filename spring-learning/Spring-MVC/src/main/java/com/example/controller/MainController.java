package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 申宇强
 * @Date 2024/3/6 9:17
 */
@Controller
public class MainController {
    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

}
