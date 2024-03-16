package com.shen.service;


import com.shen.entity.Book;
import com.shen.entity.Borrow;

import java.util.List;
import java.util.Map;

/**
 * @Author 申宇强
 * @Date 2024/3/16 16:03
 */
public interface BookService {
    List<Borrow> getBorrowList();
    Map<Book, Boolean> getBookList();
    List<Book> getActiveBookList();
    void addBorrow(int sid, int bid);
    void returnBook(String id);
    void addBook(String title, String author, double price);
    void deleteBook(int bid);
}

