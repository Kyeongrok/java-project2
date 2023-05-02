package com.example.javaproject2.week3.d1;

import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {
        // 초기화식, 증감식 없는 for문
        // 조건식만 있음
        while(true){
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
