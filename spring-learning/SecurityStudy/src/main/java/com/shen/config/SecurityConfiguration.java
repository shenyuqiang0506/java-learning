package com.shen.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import javax.sql.DataSource;

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

    //    @Bean   //UserDetailsService就是获取用户信息的服务
//    //经过BCrypt加密
//    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//        //每一个UserDetails就代表一个用户信息，其中包含用户的用户名和密码以及角色
//        UserDetails user = User
//                .withUsername("user")
//                .password(encoder.encode("123456"))   //这里将密码进行加密后存储
//                .roles("USER")
//                .build();
//        System.out.println(encoder.encode("123456"));
//        UserDetails admin = User
//                .withUsername("admin")
//                .password(encoder.encode("123456"))   //这里将密码进行加密后存储
//                .roles("ADMIN", "USER")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//        //创建一个基于内存的用户信息管理器作为UserDetailsService
//    }
    //jdbc
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource,
//                                                 PasswordEncoder encoder) {
//        //        //仅首次启动时创建一个新的用户用于测试，后续无需创建
////        manager.createUser(User.withUsername("user")
////                .password(encoder.encode("123456")).roles("USER").build());
//        return new JdbcUserDetailsManager(dataSource);
//    }
    @Bean
    public UserDetailsManager userDetailsService(DataSource dataSource,
                                                 PasswordEncoder encoder) throws Exception {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
        //为UserDetailsManager设置AuthenticationManager即可开启重置密码的时的校验
        manager.setAuthenticationManager(authenticationManager(manager, encoder));
        return manager;
    }

    //手动创建一个AuthenticationManager用于处理密码校验
    private AuthenticationManager authenticationManager(UserDetailsManager manager,
                                                        PasswordEncoder encoder) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(manager);
        provider.setPasswordEncoder(encoder);
        return new ProviderManager(provider);
    }

    @Bean
    public DataSource dataSource() {
        //数据源配置
        return new PooledDataSource("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/test", "root", "123456");
    }

}
