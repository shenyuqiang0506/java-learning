package book.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 申宇强
 * @Date 2024/1/31 15:35
 */
@Data
@NoArgsConstructor
public class Student {
    int sid;
    String name;
    String sex;
    int grade;

    public Student(String name, String sex, int grade) {
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }
}
