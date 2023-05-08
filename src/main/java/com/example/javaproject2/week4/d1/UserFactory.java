package com.example.javaproject2.week4.d1;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.age = 37;
        return user;
    }
}
