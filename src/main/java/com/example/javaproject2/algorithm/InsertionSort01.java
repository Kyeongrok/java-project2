package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        for (int i = 1; i < arr.length; i++) {
            // i == 1
            // 1 vs 0
            // i == 2
            // 2 vs 1
            // 1 vs 0
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
