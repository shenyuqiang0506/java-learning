package com.shen.controller;

import com.alibaba.fastjson2.JSONObject;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 申宇强
 * @Date 2024/3/12 11:00
 */
@Controller
public class HelloController {
    //SpringSecurity之后，我们网站的登录验证模块相当于直接被接管了
//    @PostMapping("/login")
//    //处理登录操作并跳转
//    public String login(@RequestParam String username, @RequestParam String password,
//                        HttpSession session,
//                        Model model) {
//        if ("test".equals(username) && "123456".equals(password)) {
//            session.setAttribute("login", true);
//            return "redirect:/";
//        } else {
//            model.addAttribute("status", true);
//            return "login";
//        }
//    }

    //处理首页或是登录界面跳转
//    @GetMapping("/")
//    public String index(HttpSession session) {
//        if (session.getAttribute("login") != null) {
//            return "index";
//        } else {
//            return "login";
//        }
//    }

    //转账操作
//    @ResponseBody
//    @PostMapping("/pay")
//    public JSONObject pay(@RequestParam String account,
//                          HttpSession session) {
//        JSONObject object = new JSONObject();
//        //登录之后才能转账
//        if (session.getAttribute("login") != null) {
//            System.out.println("转账给" + account + "成功，交易已完成！");
//            object.put("success", true);
//        } else {
//            System.out.println("转账给" + account + "失败，用户未登录！");
//            object.put("success", false);
//        }
//        return object;
//    }

    //SpringSecurity的转账操作
    @ResponseBody
    @PostMapping("/pay")
    public JSONObject pay(@RequestParam String account) {
        JSONObject object = new JSONObject();
        System.out.println("转账给" + account + "成功，交易已完成！");
        object.put("success", true);
        return object;
    }

    //SpringSecurity的登录

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @Resource
    UserDetailsManager manager;
    @Resource
    PasswordEncoder encoder;

    @ResponseBody
    @PostMapping("/change-password")


    public JSONObject changePassword(@RequestParam String oldPassword,
                                     @RequestParam String newPassword) {
        manager.changePassword(oldPassword, encoder.encode(newPassword));
        JSONObject object = new JSONObject();
        object.put("success", true);
        return object;
    }
}

