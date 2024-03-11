package com.shen.controller;


import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.shen.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 申宇强
 * @Date 2024/3/6 10:04
 */
@RestController
//@Controller
public class HelloController {
    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "hello world";
    }


    //异常处理
    @RequestMapping("/index")
    public String index() {
        System.out.println("我是处理！");
        if (true) throw new RuntimeException("您的氪金力度不足，无法访问！");
        return "index";
    }

    @RequestMapping(value = "/json", produces = "application/json")
    public String json() {
        JSONArray array = new JSONArray();
        JSONObject object = new JSONObject();
        object.put("name", "杰哥");
        object.put("age", 18);
        array.add(object);
        return object.toJSONString();
//        return array.toJSONString();
//        User user = new User("shen", "123456");
//        return JSONObject.toJSONString(user);
    }

    @RequestMapping("/user")
    public User user() {
        return new User("shen", "123456");
    }
}
