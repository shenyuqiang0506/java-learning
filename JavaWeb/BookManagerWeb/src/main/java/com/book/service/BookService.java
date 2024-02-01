package com.book.service;

import com.book.entity.Book;
import com.book.entity.Borrow;
import com.book.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @Author 申宇强
 * @Date 2024/2/1 9:37
 */
public interface BookService {
    List<Borrow> getBorrowList();
    void returnBook(String id);
    List<Book> getActiveBookList();
    List<Student> getStudentList();
    void addBorrow(int sid, int bid);
    Map<Book, Boolean> getBookList();
    void deleteBook(int bid);
    void addBook(String title, String desc, double price);
}
