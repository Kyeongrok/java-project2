package com.example.javaproject2.exam.e1;

class Student {
    String name;
    int age;
    String phone;

    // 기본 생성자
    public Student() {}

    // 기본 생성자를 오버로딩 1
    // this() 를 사용하여ㅍ이미 만들어진 생성자를 불러와 코드를 줄일 수 있다.
    public Student(String name, int age, String phone) {
        this(name, age);
        this.phone = phone;
    }

    // 기본 생성자를 오버로딩 2
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.phone = null;
    }
}
