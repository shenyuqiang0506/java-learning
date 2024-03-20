package com.shen.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 申宇强
 * @Date 2024/3/20 14:26
 */
@Controller
@Slf4j
public class TestController {
    //    @PostConstruct
//    public void init() {
////        Logger logger = LoggerFactory.getLogger("test");
////        logger.info("我是日志信息");
//        log.info("我是日志信息");
//    }
    @GetMapping("/")
    @ResponseBody
    public String index(HttpSession session) {
        MDC.put("traceId", session.getId());
        log.info("访问了测试接口");
        return "helle world";
    }
}
