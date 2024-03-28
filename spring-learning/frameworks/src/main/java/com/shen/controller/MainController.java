package com.shen.controller;

import com.shen.entity.Account;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 申宇强
 * @Date 2024/3/28 8:57
 */
@Slf4j
@Validated   //首先在Controller上开启接口校验
@Controller
public class MainController {
    @ResponseBody
    @PostMapping("/submit")
    //传统校验
//    public String submit(String username, String password) {
//        //进行校验
//        if (username.length() > 3 && password.length() > 10) {
//            System.out.println(username.substring(3));
//            System.out.println(password.substring(2, 10));
//            return "请求成功!";
//        } else {
//            return "请求失败";
//        }
//    }
//    //基于注解
//    public String submit(@Length(min = 3) String username,  //使用@Length注解一步到位
//                         @Length(min = 10) String password){
//        System.out.println(username.substring(3));
//        System.out.println(password.substring(2, 10));
//        return "请求成功!";
//    }

    //对应对象类型，我们也可以进行验证，方法如下
     //在参数上添加@Valid注解表示需要验证
    public String submit(@Valid Account account){
        System.out.println(account.getUsername().substring(3));
        System.out.println(account.getPassword().substring(2, 10));
        return "请求成功!";
    }
}
