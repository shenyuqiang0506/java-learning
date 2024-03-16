package com.shen.controller;

import com.shen.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:59
 */
@Controller
public class BookController {
    @Resource
    BookService service;
    @GetMapping("/books")
    public String books(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname", user.getUsername());
        model.addAttribute("book_list", service.getBookList().keySet());
        model.addAttribute("book_list_status", new ArrayList<>(service.getBookList().values()));
        return "books";
    }

    @GetMapping("/add-book")
    public String addBook(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname", user.getUsername());
        return "add-book";
    }

    @PostMapping("/add-book")
    public String addBook(String title, String author, double price){
        service.addBook(title, author, price);
        return "redirect:/books";
    }

    @GetMapping("/delete-book")
    public String deleteBook(int bid){
        service.deleteBook(bid);
        return "redirect:/books";
    }
}
