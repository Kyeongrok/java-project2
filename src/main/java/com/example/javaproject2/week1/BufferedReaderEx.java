package com.example.javaproject2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기

        System.out.println(1 + 1); // 2

        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());
    }

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기
        System.out.println(br.read() + br.read());
    }
}
