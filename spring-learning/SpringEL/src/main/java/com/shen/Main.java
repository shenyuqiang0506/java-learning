package com.shen;

import com.shen.config.MainConfiguration;
import com.shen.entity.Student;
import com.shen.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import javax.swing.*;
import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/2/15 15:34
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        System.out.println(context.getBean(Student.class));
//        System.out.println(context.getBean(Teacher.class));
        ExpressionParser parser = new SpelExpressionParser();

        Student student = context.getBean(Student.class);
//        Expression exp = parser.parseExpression("'Hello World'");  //使用parseExpression方法来创建一个表达式
//        System.out.println(exp.getValue());   //表达式最终的运算结果可以通过getValue()获取

//        SpringEL
//        Expression exp = parser.parseExpression("map['test']");  //对于Map这里映射型，可以直接使用map[key]来取出value
//        System.out.println(exp.getValue(student));
//        Expression exp = parser.parseExpression("list[2]");   //对于List、数组这类，可以直接使用[index]
//        System.out.println(exp.getValue(student));
        //快速创建集合
//        Expression exp = parser.parseExpression("{5, 2, 1, 4, 6, 7, 0, 3, 9, 8}"); //使用{}来快速创建List集合
//        List value = (List) exp.getValue();
//        value.forEach(System.out::println);
        //现在我们希望从list中获取那些满足我们条件的元素，并组成一个新的集合，我们可以使用.?运算符
//        Expression exp = parser.parseExpression("list.?[name == '高等数学']");
//        System.out.println(exp.getValue(student));
//        Expression exp = parser.parseExpression("list.?[score > 3]");   //选择学分大于3分的科目
//        System.out.println(exp.getValue(student));
        Expression exp = parser.parseExpression("list.![name]");   //使用.!创建投影集合，这里创建的时课程名称组成的新集合
        System.out.println(exp.getValue(student));
    }
}
