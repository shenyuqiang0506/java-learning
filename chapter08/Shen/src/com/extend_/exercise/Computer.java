package com.extend_.exercise;
//包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息

/**
 * @Author 申宇强
 * @Date 2023/5/12 15:10
 */
public class Computer {
    private String cup;
    private int memory;
    private int disk;

    public Computer(String cup, int memory, int disk) {
        this.cup = cup;
        this.memory = memory;
        this.disk = disk;
    }

    //getDetails 方法用于返回 Computer 的详细信息
    public String getDetails() {
        return "cpu=" + cup + "memory=" + memory + "disk=" + disk;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
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
