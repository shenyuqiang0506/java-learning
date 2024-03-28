package com.shen.enroll.controller;

import com.shen.enroll.mapper.UserMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Random;

/**
 * @Author 申宇强
 * @Date 2024/3/24 15:15
 */
@RestController
public class RegisterController {
    @Resource
    JavaMailSender sender;

    @PostMapping("/code")
    public String getCode(@RequestParam String email,
                          HttpSession session) {
        Random random = new Random();
        int code = random.nextInt(900000) + 100000;
        session.setAttribute("email", email); // 将邮箱地址设置到会话中
        session.setAttribute("code", code);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("你的验证码");
        message.setText("你的验证码是：" + code + "有效时间三分钟");
        message.setFrom("2861476552@qq.com");
        message.setTo(email);
        sender.send(message);
        return "发送成功";
    }

    @Resource
    UserMapper mapper;

    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String email,
                           @RequestParam int code,
                           @RequestParam String password,
                           HttpSession session) {
        Integer sessionCode = (Integer) session.getAttribute("code");
        String sessionEmail = (String) session.getAttribute("email");
        if (sessionCode == null)
            return "请先获取";
        if (sessionCode != code)
            return "验证码错误";
        if (!Objects.equals(sessionEmail, email)) {
            return "邮箱不匹配，请先获取验证码";
        }
        System.out.println("Session Email: " + sessionEmail);
        System.out.println("Input Email: " + email);

        mapper.createUser(username, email, password);
        return "注册成功";
    }
}
