package com.example.javaproject2.algorithm.week5;

import java.util.Arrays;

public class InsertionSort02 {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if (arr[j - 1] - arr[j] > 0 ) { // 내림차순
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        // i j j-1
        // 1 1 0
        // 2 2 1
        // 2 1 2
        // 3 3 2
        // 3 2 1
        // 3 1 0
        System.out.println(Arrays.toString(arr));
    }
}
