package book.manager.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 申宇强
 * @Date 2024/1/31 16:59
 */
@Data
@NoArgsConstructor
public class Borrow {
    int id;
    Student student;
    Book book;

    public Borrow(Student student, Book book) {
        this.student = student;
        this.book = book;
    }
}
