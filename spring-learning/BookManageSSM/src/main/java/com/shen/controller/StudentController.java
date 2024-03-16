package com.shen.controller;

import com.shen.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:59
 */
@Controller
public class StudentController {

    @Resource
    UserService service;

    @GetMapping("/student")
    public String student(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname", user.getUsername());
        model.addAttribute("student_list", service.getStudentList());
        return "student";
    }

}
