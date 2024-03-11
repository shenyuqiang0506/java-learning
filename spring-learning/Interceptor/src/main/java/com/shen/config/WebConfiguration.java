package com.shen.config;

import com.alibaba.fastjson2.support.spring6.http.converter.FastJsonHttpMessageConverter;
import com.shen.Interceptor.MainInterceptor;
import com.shen.Interceptor.SubInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/3/6 9:56
 */
@Controller
@EnableWebMvc//快速配置SpringMvc注解，如果不添加此注解会导致后续无法通过实现WebMvcConfigurer接口进行自定义配置
@ComponentScans({
        @ComponentScan("com.shen.controller"),
        @ComponentScan("com.shen.entity")
})
public class WebConfiguration implements WebMvcConfigurer {
    //我们需要使用ThymeleafViewResolver作为视图解析器，并解析我们的HTML页面
    @Bean
    public ThymeleafViewResolver thymeleafViewResolver(SpringTemplateEngine springTemplateEngine) {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setOrder(1);   //可以存在多个视图解析器，并且可以为他们设定解析顺序
        resolver.setCharacterEncoding("UTF-8");   //编码格式是重中之重
        resolver.setTemplateEngine(springTemplateEngine);   //和之前JavaWeb阶段一样，需要使用模板引擎进行解析，所以这里也需要设定一下模板引擎
        return resolver;
    }

    //配置模板解析器
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setSuffix(".html");   //需要解析的后缀名称
        resolver.setPrefix("classpath:");   //需要解析的HTML页面文件存放的位置，默认是webapp目录下，如果是类路径下需要添加classpath:前缀
        return resolver;
    }

    //配置模板引擎Bean
    @Bean
    public SpringTemplateEngine springTemplateEngine(ITemplateResolver resolver) {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(resolver);   //模板解析器，默认即可
        return engine;
    }

    //    如js、css，因此这里我们还需要配置一下，让静态资源通过Tomcat提供的默认Servlet进行解析
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();   //开启默认的Servlet
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //配置静态资源的访问路径
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //一号拦截器
        registry.addInterceptor(new MainInterceptor())
                .addPathPatterns("/**");//添加拦截器的匹配路径，只要匹配一律拦截
//                .excludePathPatterns("/test");//拦截器不进行拦截的路径
        //二号拦截器
        registry.addInterceptor(new SubInterceptor()).addPathPatterns("/**");
    }

//    FastJSON转换器配置
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new FastJsonHttpMessageConverter());
    }
}
