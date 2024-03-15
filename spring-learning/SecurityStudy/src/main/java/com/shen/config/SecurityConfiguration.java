package com.shen.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

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
        //System.out.println(new BCryptPasswordEncoder().encode("123456"));
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
//    @Bean
//    public UserDetailsManager userDetailsService(DataSource dataSource,
//                                                 PasswordEncoder encoder) throws Exception {
//        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
//        //为UserDetailsManager设置AuthenticationManager即可开启重置密码的时的校验
//        manager.setAuthenticationManager(authenticationManager(manager, encoder));
//        return manager;
//    }
//
//    //手动创建一个AuthenticationManager用于处理密码校验
//    private AuthenticationManager authenticationManager(UserDetailsManager manager,
//                                                        PasswordEncoder encoder) {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(manager);
//        provider.setPasswordEncoder(encoder);
//        return new ProviderManager(provider);
//    }

    @Bean
    public DataSource dataSource() {
        //数据源配置
        return new PooledDataSource("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/test", "root", "123456");
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean;
    }

    //持久化保存
    @Bean
    public PersistentTokenRepository tokenRepository(DataSource dataSource) {
        JdbcTokenRepositoryImpl repository = new JdbcTokenRepositoryImpl();
//        //在启动时自动在数据库中创建存储记住我信息的表，仅第一次需要，后续不需要
//        repository.setCreateTableOnStartup(true);
        repository.setDataSource(dataSource);
        return repository;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           PersistentTokenRepository repository) throws Exception {
        return http
                //以下是验证请求拦截和放行配置
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/static/**").permitAll();   //将所有的静态资源放行，一定要添加在全部请求拦截之前
                    auth.anyRequest().authenticated();    //将所有请求全部拦截，一律需要验证
                })
                //以下是表单登录相关配置
                .formLogin(conf -> {
                    conf.loginPage("/login");   //将登录页设置为我们自己的登录页面
                    conf.loginProcessingUrl("/doLogin"); //登录表单提交的地址，可以自定义
                    conf.defaultSuccessUrl("/");   //登录成功后跳转的页面
                    conf.permitAll();    //将登录相关的地址放行，否则未登录的用户连登录界面都进不去
                    //用户名和密码的表单字段名称，不过默认就是这个，可以不配置，除非有特殊需求
                    conf.usernameParameter("username");
                    conf.passwordParameter("password");
                })
                .logout(conf -> {
                    conf.logoutUrl("/doLogout"); //退出登录地址，跟上面一样可自定义
                    conf.logoutSuccessUrl("/login");//退出登录成功后跳转的地址，这里设置为登录界面
                    conf.permitAll();
                })
                //以下是csrf相关配置
                .csrf(conf -> {
                    conf.disable();   //此方法可以直接关闭全部的csrf校验，一步到位
                    conf.ignoringRequestMatchers("/xxx/**");   //此方法可以根据情况忽略某些地址的csrf校验
                })
                //记住我登录相关配置
                .rememberMe(conf -> {
                    conf.alwaysRemember(false);  //这里不要开启始终记住，我们需要配置为用户自行勾选
//                    conf.rememberMeParameter("remember-me");   //记住我表单字段，默认就是这个，可以不配置
//                    conf.rememberMeCookieName("");  //记住我设置的Cookie名字，也可以自定义，不过没必要
                    conf.tokenRepository(repository);      //设置刚刚的记住我持久化存储库
                    conf.tokenValiditySeconds(3600 * 7);   //设置记住我有效时间为7天
                })
                .build();

    }
}
