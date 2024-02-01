package com.book.filter;

import com.book.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 申宇强
 * @Date 2024/2/1 8:36
 */
@WebFilter("/*")
public class MainFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化代码，如果你的过滤器需要一些初始化资源，可以在这里进行
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String url = req.getRequestURL().toString();

        // 检查是否访问的是登录页面或静态资源
        boolean isLoginRequest = url.endsWith("login");
        boolean isStaticResource = url.contains("/static/");

        if (!isLoginRequest && !isStaticResource) {
            HttpSession session = req.getSession(false); // 传入false表示如果不存在会话则不创建新会话
            if (session == null || session.getAttribute("user") == null) {
                // 用户未登录，重定向到登录页面
                res.sendRedirect(req.getContextPath() + "/login"); // 使用 getContextPath() 确保路径正确
                return;
            }
        }

        // 如果请求满足登录条件或是访问静态资源，继续过滤链
        chain.doFilter(request, response);
    }


    @Override
    public void destroy() {
        // 清理代码，如果你的过滤器打开了一些资源（如数据库连接），可以在这里关闭它们
    }
}

