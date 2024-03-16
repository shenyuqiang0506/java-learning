package com.shen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:50
 */
@Controller
public class IndexController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
