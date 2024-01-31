package book.manager.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 申宇强
 * @Date 2024/1/31 15:36
 */
@Data
@NoArgsConstructor
public class Book {
    int bid;
    String title;
    String desc;
    double price;

    public Book(String title, String desc, double price) {
        this.title = title;
        this.desc = desc;
        this.price = price;
    }
}
