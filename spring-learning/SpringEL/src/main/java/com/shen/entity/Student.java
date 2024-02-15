package com.shen.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author 申宇强
 * @Date 2024/2/15 15:35
 */
@ToString
@Component("test")//容器自己反射获取构造方法去生成这个对象
public class Student {
    //    @Value("${test.name}")
//    String name;
//    public Student(@Value("${test.name}") String name) {
//        this.name = name;
//    }
//
//    public void test() {
//        System.out.println("我叫" + name);
//    }
//    public Map<String, String> map = Map.of("test", "你干嘛");
//    public List<String> list = List.of("AAA", "BBB", "CCC");

    public List<Clazz> list = List.of(new Clazz("高等数学", 4),
            new Clazz("大学英语", 5),
            new Clazz("大学物理", 6),
            new Clazz("大学化学", 7),
            new Clazz("大学生物", 4),
            new Clazz("大学历史", 4),
            new Clazz("大学地理", 1),
            new Clazz("大学政治", 14),
            new Clazz("大学文化", 14),
            new Clazz("大学英语", 13),
            new Clazz("大学英语", 12)
    );

    public record Clazz(String name, int score) {

    }
}
