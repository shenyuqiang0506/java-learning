package com.shen.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author 申宇强
 * @Date 2024/2/14 18:14
 */
public class TestEvent extends ApplicationEvent {   //自定义事件需要继承ApplicationEvent
    public TestEvent(Object source) {
        super(source);
    }
}
