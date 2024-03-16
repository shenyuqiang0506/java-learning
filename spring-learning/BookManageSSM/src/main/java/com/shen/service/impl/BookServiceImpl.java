package com.shen.service.impl;

import com.shen.entity.Book;
import com.shen.entity.Borrow;
import com.shen.mapper.BookMapper;
import com.shen.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author 申宇强
 * @Date 2024/3/16 16:03
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Map<Book, Boolean> getBookList() {
        Set<Integer> set = new HashSet<>();
        this.getBorrowList().forEach(borrow -> set.add(borrow.getBid()));
        Map<Book, Boolean> map = new LinkedHashMap<>();
        mapper.getBookList().forEach(book -> map.put(book, set.contains(book.getId())));
        return map;
    }

    @Override
    public List<Book> getActiveBookList() {
        Set<Integer> set = new HashSet<>();
        this.getBorrowList().forEach(borrow -> set.add(borrow.getBid()));
        return mapper.getBookList()
                .stream()
                .filter(book -> !set.contains(book.getId()))
                .toList();
    }

    @Override
    public List<Borrow> getBorrowList() {
        return mapper.getBorrowList();
    }

    @Override
    public void addBorrow(int sid, int bid) {
        mapper.addBorrow(sid, bid);
    }

    @Override
    public void returnBook(String id) {
        mapper.deleteBorrow(id);
    }

    @Override
    public void addBook(String title, String author, double price) {
        mapper.addBook(title, author, price);
    }

    @Override
    public void deleteBook(int bid) {
        mapper.deleteBook(bid);
    }
}
