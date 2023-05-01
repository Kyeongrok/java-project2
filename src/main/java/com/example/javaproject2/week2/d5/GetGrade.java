package com.example.javaproject2.week2.d5;

public class GetGrade {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 70) {
            System.out.println("C");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}
