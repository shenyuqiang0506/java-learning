package com.shen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Author 申宇强
 * @Date 2024/3/19 14:41
 */
//依然只需要Configuration注解即可，不需要其他配置
//依然只需要Configuration注解即可，不需要其他配置
@Configuration
public class SecurityConfiguration {

//    //配置方式跟之前SSM阶段是一样的
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(auth -> {
//                    //auth.requestMatchers("/static/**").permitAll();
//                    //auth.anyRequest().authenticated();
//                    auth.anyRequest().permitAll();
//                })
//                .formLogin(conf -> {
//                    conf.loginPage("/login");
//                    conf.loginProcessingUrl("/doLogin");
//                    conf.defaultSuccessUrl("/");
//                    conf.permitAll();
//                })
//                .build();
//    }
}