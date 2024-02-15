package com.shen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author 申宇强
 * @Date 2024/2/15 15:34
 */
@Configuration
@ComponentScans({
        @ComponentScan("com.shen.entity"),
})
@PropertySource(value = "classpath:test.properties", encoding = "UTF-8")
public class MainConfiguration {
}
