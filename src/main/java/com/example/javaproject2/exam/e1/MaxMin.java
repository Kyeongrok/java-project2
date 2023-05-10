package com.example.javaproject2.exam.e1;

public class MaxMin {
    public static void main(String[] args) {
        int maxValue = 0;
        int[] numbers = {-2, -1, -3, -9, -7};
        for (int i = 0; i < numbers.length; i++) {
            if(maxValue > numbers[i]) maxValue = numbers[i];
        }
        System.out.println(maxValue);
    }
}
