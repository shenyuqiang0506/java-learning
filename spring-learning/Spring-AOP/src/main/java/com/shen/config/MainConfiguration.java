package com.shen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author 申宇强
 * @Date 2024/2/15 16:41
 */
@Configuration
@ComponentScans({
        @ComponentScan("com.shen.entity"),
})
@EnableAspectJAutoProxy
public class MainConfiguration {
}
