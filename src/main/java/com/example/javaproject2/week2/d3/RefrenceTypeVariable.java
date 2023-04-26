package com.example.javaproject2.week2.d3;

import com.example.javaproject2.PrintHello;

public class RefrenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student student = new Student(); // new를 써서 Student객체를 인스턴스로

        Student[] students = new Student[30];

        Object obj = new Student();
        Object obj2 = new PrintHello();

        // primitive type은 class가 아님

    }
}
