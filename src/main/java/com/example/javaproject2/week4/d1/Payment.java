package com.example.javaproject2.week4.d1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();
        if (isSufficient) {
            System.out.println("결제 처리 합니다.");
        } else {
            System.out.println("잔액이 부족합니다 재생.");
        }
    }
}
