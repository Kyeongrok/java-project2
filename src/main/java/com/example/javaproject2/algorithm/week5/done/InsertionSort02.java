package com.example.javaproject2.algorithm.week5.done;

import java.util.Arrays;

public class InsertionSort02 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
