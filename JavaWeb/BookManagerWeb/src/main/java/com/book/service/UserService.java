package com.book.service;

import javax.servlet.http.HttpSession;

/**
 * @Author 申宇强
 * @Date 2024/2/1 8:49
 */
public interface UserService {
    boolean auth(String username, String password, HttpSession session);
}
