package com.example.javaproject2.week2.d4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;
        int roomTemperature = 22;

        boolean result = waterTemperature < 50 && roomTemperature < 24;
        System.out.printf("check result: %b\n", result);
    }
}
