package com.poly.polyarr;

/**
 * @Author 申宇强
 * @Date 2023/5/17 14:44
 */
public class PolyArray {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下：要求创建1个Person对象、
        // 2个Student 对象和2个Teacher对象, 统一放在数组中，并调用每个对象say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 20, 100);
        persons[2] = new Student("xiaomi", 20, 99);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);
        //循环遍历多态数组，调用say
        for (int i = 0; i < persons.length; i++) {
            //老师提示: person[i] 编译类型是 Person ,运行类型是是根据实际情况有JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //利用向下转型
            if (persons[i] instanceof Student) {//判断person[i] 的运行类型是不是Student
                //也可以使用一条语句 ((Student)((Student) persons[i])).study();
                Student student = (Student) persons[i];//向下转型
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person){

            }else {
                System.out.println("类型有误,请检查");
            }
        }
    }
}
