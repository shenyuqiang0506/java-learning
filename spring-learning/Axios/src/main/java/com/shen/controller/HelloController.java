package com.shen.controller;


import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.shen.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 申宇强
 * @Date 2024/3/6 10:04
 */
//@RestController
@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

//    @ResponseBody
//    @GetMapping("/test")
//    public User test() {
//        return new User("shen", "123456");
//    }
    @ResponseBody
    @PostMapping(value = "/test", produces = "application/json")
    public String hello( User user){
        boolean success = "test".equals(user.getUsername()) && "123456".equals(user.getPassword());
        JSONObject object = new JSONObject();
        object.put("success", success);
        return object.toString();
    }
}
