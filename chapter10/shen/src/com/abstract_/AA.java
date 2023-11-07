package com.abstract_;

/**
 * @Author 申宇强
 * @Date 2023/9/7 15:25
 */
public class AA extends Template{

    //计算任务
    //1+....+ 10000
    public void job() {

        long num = 0;
        for (long i = 0; i < 800000000; i++) {
            num += i;
        }
        //得到结束的时间
        System.out.println("job()执行结果=" + num);
    }
}
