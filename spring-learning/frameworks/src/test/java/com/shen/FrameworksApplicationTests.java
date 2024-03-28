package com.shen;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class FrameworksApplicationTests {
    //JavaMailSender是专门用于发送邮件的对象，自动配置类已经提供了Bean
    @Resource
    JavaMailSender sender;

    @Test
    void contextLoads() {
        //SimpleMailMessage是一个比较简易的邮件封装，支持设置一些比较简单内容
        SimpleMailMessage mail = new SimpleMailMessage();
        //设置邮件标题
        mail.setSubject("【福建农业职业技术学院教务处】关于近期学校对您的处分决定");
        //设置邮件内容
        mail.setText("同学您好，经监控和教务巡查发现，您近期存在旷课、迟到、早退、上课刷抖音行为，" +
                     "现已通知相关辅导员，请手写5000字书面检讨，并在2024年4月1日17点前交到辅导员办公室。");
        //设置邮件发送给谁，可以多个
        mail.setTo("2801393525@qq.com");
        //mail.setTo("2861476552@qq.com");
        //  mail.setTo("781907148@qq.com");
//        mail.setTo("617612513@qq.com");
        mail.setFrom("2861476552@qq.com");
        sender.send(mail);
    }

}
