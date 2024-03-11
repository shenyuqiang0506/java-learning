package com.shen.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author 申宇强
 * @Date 2024/3/11 14:06
 */
@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(Exception.class)
    public String error(Exception e, Model model) {//可以直接添加形参来获取异常
        e.printStackTrace();
        model.addAttribute("e", e);
        return "error";
    }
}
