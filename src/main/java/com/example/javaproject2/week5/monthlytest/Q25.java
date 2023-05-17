package com.example.javaproject2.week5.monthlytest;

public class Q25 {
    public static void main(String[] args) {
        int x = 1;
        for(int i = 0; 3 * i < 10; i++) {
            System.out.printf("--%d\n", i);
            if(i == 2) {
                System.out.println("--if--");
                i = --i + 2 + x++;
            }
            System.out.println(i);
        }
    }
}
