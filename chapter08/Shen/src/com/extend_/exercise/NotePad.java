package com.extend_.exercise;

/**
 * @Author 申宇强
 * @Date 2023/5/12 15:27
 */
public class NotePad extends Computer {
    private String color;

    public NotePad(String cup, int memory, int disk) {
        super(cup, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){
        System.out.println("PC信息=");
        System.out.println(getDetails()+"color="+color);
    }
}

