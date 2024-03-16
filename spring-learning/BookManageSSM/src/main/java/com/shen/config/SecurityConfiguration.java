package com.shen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import javax.sql.DataSource;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:06
 */
@EnableWebSecurity
@Configuration
public class SecurityConfiguration {
    @Bean
    //密码加密
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    //记住我 的token存储
    public PersistentTokenRepository tokenRepository(DataSource dataSource) {
        JdbcTokenRepositoryImpl repository = new JdbcTokenRepositoryImpl();
        repository.setDataSource(dataSource);
        return repository;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           PersistentTokenRepository repository) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/static/**").permitAll();
                    auth.anyRequest().authenticated();
                })
                //登录
                .formLogin(conf -> {
                    conf.loginPage("/login");
                    conf.loginProcessingUrl("/doLogin");
                    conf.defaultSuccessUrl("/");
                    conf.permitAll();
                })
//                登出
                .logout(conf -> {
                    conf.logoutUrl("/doLogout");
                    conf.logoutSuccessUrl("/login");
                    conf.permitAll();
                })
                //关闭csrf
                .csrf(AbstractHttpConfigurer::disable)
                //记住我
                .rememberMe(conf -> {
                    conf.tokenRepository(repository);
                    conf.tokenValiditySeconds(3600 * 24 * 7);
                })
                .build();
    }
}
