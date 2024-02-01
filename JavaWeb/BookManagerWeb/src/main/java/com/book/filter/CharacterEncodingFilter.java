package com.book.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author 申宇强
 * @Date 2024/1/31 20:56
 */

@WebFilter("/*") // 表示这个 Filter 应用于所有的请求
public class CharacterEncodingFilter implements Filter {

    private String encoding = "UTF-8"; // 默认编码

    public void init(FilterConfig filterConfig) throws ServletException {
        // 可以在这里从 filterConfig 读取初始化参数
        String encodingParam = filterConfig.getInitParameter("encoding");
        if (encodingParam != null) {
            encoding = encodingParam;
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // 设置请求和响应的字符编码
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        // 继续调用 Filter 链
        chain.doFilter(request, response);
    }

    public void destroy() {
        // 在这里可以进行资源释放等清理工作
    }
}