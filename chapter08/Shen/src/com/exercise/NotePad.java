package com.exercise;

/**
 * @Author 申宇强
 * @Date 2023/4/24 10:59
 */
public class NotePad extends Computer{
    private String color;
    public NotePad(String cpu, int memory, int disk,String brand,String color) {
        super(cpu, memory, disk,brand,color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
