package com.example.javaproject2.week2;

public class StringPlusInt {
    public static void main(String[] args) {
        System.out.println("1" + 1);
        String result = 1 + "1";
        System.out.println("result = " + result);

        int iResult = 1 + Integer.parseInt("1");
        System.out.println("iResult = " + iResult);
    }
}
