package com.example.javaproject2.week2.d2;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "김경록";
        int balance = 2_000_0000;
        String message = name + "님의 통장 잔고는" + balance + "원 입니다.";
        System.out.println(message);
    }
}
