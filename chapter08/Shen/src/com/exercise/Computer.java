package com.exercise;

/**
 * @Author 申宇强
 * @Date 2023/4/24 10:45
 */
//编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
public class Computer {
    private String cpu;
    private int memory;
    private int disk;
    private String brand;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Computer(String cpu, int memory, int disk, String brand, String color) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Computer(String cpu, int memory, int disk, String brand) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
        this.brand= brand;
    }
    //getDetails 方法用于返回 Computer 的详细信息
    public String getDetails(){
        return "cpu= " + cpu + "memory= " + memory + "disk= " + disk + "brand= " + brand + "颜色= " + color;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

