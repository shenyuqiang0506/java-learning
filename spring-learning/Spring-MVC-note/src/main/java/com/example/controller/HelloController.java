package com.example.controller;

import com.example.entity.TestBean;
import com.example.entity.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 申宇强
 * @Date 2024/3/6 10:04
 */
@Controller
//@RequestMapping("/test")
public class HelloController {
    @RequestMapping("/test")
//    public ModelAndView hello() {
//        //数据我们可以直接向Model模型层进行提供
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.getModel().put("name", "啊这");   //将name传递给Model
////        return new ModelAndView("index");  //返回ModelAndView对象，这里填入了视图的名称
//        //返回后会经过视图解析器进行处理
//
//        return modelAndView;
//
//    }
//    可以直接返回
//    public String hello(Model model) {
//     return "index";
//    }

//    @RequestMapping("/b")
//    public String test(Model model) {
//        model.addAttribute("name", "测试");
//        return "index";
//    }

    public String hello(@RequestParam("username") String username) {
        System.out.println(username);
        return "index";
    }

    //SpringMVC会自动传递该请求原本的`HttpServletRequest`对象，
// 同理，我们也可以添加`HttpServletResponse`作为形式参数，甚至可以直接将HttpSession也作为参数传递：
    @RequestMapping(value = "/index")
    public ModelAndView index(HttpSession session) {
        System.out.println(session.getAttribute("test"));
        session.setAttribute("test", "鸡你太美");
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/user")
    public ModelAndView index(User user) {
        System.out.println("获取到cookie值为：" + user);
        return new ModelAndView("index");
    }

    //    通过使用`@CookieValue`注解，我们也可以快速获取请求携带的Cookie信息：
    @RequestMapping(value = "/cookie")
    public ModelAndView index(HttpServletResponse response,
                              @CookieValue(value = "test", required = false) String test) {
        System.out.println("获取到cookie值为：" + test);
        response.addCookie(new Cookie("test", "shen"));
        return new ModelAndView("index");
    }

    //Session也能使用注解快速获取：
    @RequestMapping(value = "/session")
    public ModelAndView index(@SessionAttribute(value = "test", required = false) String test,
                              HttpSession session) {
        session.setAttribute("test", "SHEN");
        System.out.println(test);
        return new ModelAndView("index");
    }

    //    重定向和请求转发
    @RequestMapping("/redirect")
    public String index() {
        return "redirect:index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    //请求转发
    @RequestMapping("/forward")
    public String forward() {
        return "forward:index";
    }

    @Autowired
    TestBean bean;

    @ResponseBody
    @GetMapping("/auto")
    public String auto() {
        return bean.toString();
    }

}
