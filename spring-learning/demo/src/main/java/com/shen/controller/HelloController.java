package com.shen.controller;

import com.shen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 申宇强
 * @Date 2024/3/11 17:22
 */
@Controller
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping("/")
    public String user(@RequestParam int id,
                       Model model) {
        model.addAttribute("user", service.findUserById(id));
        return "index";
    }
}
