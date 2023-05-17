package com.example.javaproject2.week5.monthlytest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기
        System.out.println(br.read() + br.read());
    }

    public static void main(String[] args) throws IOException {
        Q4 q4 = new Q4();
        q4.plusTwoNumbers();
    }
}
