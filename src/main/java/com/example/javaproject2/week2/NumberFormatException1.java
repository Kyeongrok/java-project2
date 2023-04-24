package com.example.javaproject2.week2;

public class NumberFormatException1 {
    public static void main(String[] args) {
        String str = "123ab"; // 숫자가 아닌 문자열
        int num = Integer.parseInt(str);
    }
}
