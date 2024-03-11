package com.shen.controller;


import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.shen.entity.User;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

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
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam MultipartFile file) throws IOException {
        File fileObj = new File("test.png");
        file.transferTo(fileObj);
        System.out.println("用户上传的文件已保存到："+fileObj.getAbsolutePath());
        return "文件上传成功！";
    }
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    @ResponseBody
    public void download(HttpServletResponse response){
        response.setContentType("multipart/form-data");
        try(OutputStream stream = response.getOutputStream();
            InputStream inputStream = new FileInputStream("test.png")){
            IOUtils.copy(inputStream, stream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
