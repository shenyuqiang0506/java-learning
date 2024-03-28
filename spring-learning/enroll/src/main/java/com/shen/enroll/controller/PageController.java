package com.shen.enroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 申宇强
 * @Date 2024/3/24 15:04
 */
@Controller
public class PageController {
    @GetMapping("/")
    public String register() {
        return "register";
    }

}
