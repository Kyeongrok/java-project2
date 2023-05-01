package com.example.javaproject2.week2.d5;

import com.example.javaproject2.week1.day5.User;

public class SwitchCaseWithUser {
    public static void main(String[] args) {
        Student student = new Student();
        student.role = Role.STUDENT;

        switch (student.role){
            case ADMIN:
                System.out.println("접근 가능 합니다.");
                break;
            case MENTOR:
                System.out.println("접근 가능 합니다.");
                break;
            case STUDENT:
                System.out.println("접근 불가 합니다.");
                break;
            default:
                System.out.println("접근 불가 합니다.");
        }
    }
}
