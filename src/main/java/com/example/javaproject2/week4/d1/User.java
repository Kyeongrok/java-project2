package com.example.javaproject2.week4.d1;

public class User {
    private String name;
    private String phoneNumber; // "01012345678" --> 0없어짐
    private String password;
    private int age;

    public User() {
    }

    public User(String phoneNumber, int age) {
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getPassword() {
        // --> 접근제어 로직
        return password;
    }

    public void setPassword(String password) {
        // --> 본인 확인 로직
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult() {
        return age >= 18;
    }

}
