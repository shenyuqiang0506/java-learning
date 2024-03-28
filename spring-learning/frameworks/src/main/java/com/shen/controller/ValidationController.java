package com.shen.controller;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.ValidationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 申宇强
 * @Date 2024/3/28 9:13
 */
@ControllerAdvice
public class ValidationController {
    @ResponseBody
    @ExceptionHandler({ConstraintViolationException.class, MethodArgumentNotValidException.class})
//    public String error(ValidationException e) {
//        return e.getMessage();   //出现异常直接返回消息
//    }
//    对于实体类接收参数的验证，会抛出MethodArgumentNotValidException异常
    public String error(Exception e) {
        if (e instanceof ConstraintViolationException exception) {
            return exception.getMessage();
        } else if (e instanceof MethodArgumentNotValidException exception) {
            if (exception.getFieldError() == null) return "未知错误";
            return exception.getFieldError().getDefaultMessage();
        }
        return "未知错误";
    }
}
