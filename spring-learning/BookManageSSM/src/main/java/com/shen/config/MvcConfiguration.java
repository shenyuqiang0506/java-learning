package com.shen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:07
 */
@EnableWebMvc
@Configuration
@ComponentScans({
        @ComponentScan("com.shen.controller")
})
public class MvcConfiguration implements WebMvcConfigurer {
    @Bean
    // Thymeleaf视图解析器
    public ThymeleafViewResolver thymeleafViewResolver(SpringTemplateEngine springTemplateEngine) {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setOrder(1);
        resolver.setCharacterEncoding("UTF-8");
        resolver.setTemplateEngine(springTemplateEngine);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setSuffix(".html");
        resolver.setPrefix("classpath:/templates/");
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

    @Bean
    public SpringTemplateEngine springTemplateEngine(ITemplateResolver resolver) {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(resolver);
        return engine;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //静态资源配置
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
