package com.shen.entity;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import lombok.Data;

/**
 * @Author 申宇强
 * @Date 2024/4/25 上午9:36
 */
//@Data
//public class RestBean<T> {
//    int code;
//    T data;
//    String message;
//
//    private RestBean(int code, T data, String message) {
//        this.code = code;
//        this.data = data;
//        this.message = message;
//    }
//
//    public static <T> RestBean<T> success(T data) {
//        return new RestBean<>(200, data, "获取成功");
//    }
//
//    public static <T> RestBean<T> failure(int code, String message) {
//        return new RestBean<>(code, null, message);
//    }
//
//    public String asJsonString() {
//        return JSONObject
//                .from(this, JSONWriter.Feature.WriteNulls)
//                .toString();
//    }
//}

//新方法
public record RestBean<T>(int code, T data, String message) {
    //写几个工具方法，用于快速创建RestBean对象
    public static <T> RestBean<T> success(T data) {
        return new RestBean<>(200, data, "请求成功");
    }

    public static <T> RestBean<T> failure(int code, String message) {
        return new RestBean<>(code, null, message);
    }

    public static <T> RestBean<T> failure(int code) {
        return failure(code, "请求失败");
    }

    //将当前对象转换为JSON格式的字符串用于返回
    public String asJsonString() {
        return JSONObject.toJSONString(this, JSONWriter.Feature.WriteNulls);
    }
}