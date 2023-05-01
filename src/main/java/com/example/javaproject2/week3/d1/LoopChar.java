package com.example.javaproject2.week3.d1;

import java.io.IOException;
import java.io.InputStreamReader;

public class LoopChar {
    public static void main(String[] args) throws IOException {
//        for (char c = '가'; c <= '힣'; c++) {
//            System.out.printf("%c:%d ", c, c);
//        }
        InputStreamReader isr = new InputStreamReader(System.in);
        int ee = isr.read();
        System.out.println(ee);
    }
}
