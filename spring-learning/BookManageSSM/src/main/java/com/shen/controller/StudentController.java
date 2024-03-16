package com.shen.controller;

import com.shen.service.StudentService;
import com.shen.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:59
 */
@Controller
public class StudentController {

    @Resource
    UserService service;
    @Resource
    StudentService studentService;

    @GetMapping("/student")
    public String student(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname", user.getUsername());
        model.addAttribute("student_list", service.getStudentList());
        return "student";
    }

    @GetMapping("add-student")
    public String addStudent(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname", user.getUsername());
        return "add-student";
    }

    @PostMapping("/add-student")
    public String addStudent(String nane, String sex, String grade) {
        studentService.addStudent(nane, sex, grade);
        return "redirect:/student";
    }
}
