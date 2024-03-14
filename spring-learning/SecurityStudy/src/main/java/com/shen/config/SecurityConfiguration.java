package com.shen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @Author 申宇强
 * @Date 2024/3/13 15:10
 */
@Configuration
@EnableWebSecurity   //开启WebSecurity相关功能
public class SecurityConfiguration {
    //这里将BCryptPasswordEncoder直接注册为Bean，Security会自动进行选择
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean   //UserDetailsService就是获取用户信息的服务
    //经过BCrypt加密
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        //每一个UserDetails就代表一个用户信息，其中包含用户的用户名和密码以及角色
        UserDetails user = User
                .withUsername("user")
                .password(encoder.encode("123456"))   //这里将密码进行加密后存储
                .roles("USER")
                .build();
        System.out.println(encoder.encode("123456"));
        UserDetails admin = User
                .withUsername("admin")
                .password(encoder.encode("123456"))   //这里将密码进行加密后存储
                .roles("ADMIN", "USER")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
        //创建一个基于内存的用户信息管理器作为UserDetailsService
    }
}
