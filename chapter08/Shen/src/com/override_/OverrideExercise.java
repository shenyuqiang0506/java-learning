package com.override_;

/**
 * @Author 申宇强
 * @Date 2023/5/13 11:52
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        System.out.println(person.say());
        Student student = new Student("小米",13,6303989,60);
        System.out.println(student.say());
    }
}
