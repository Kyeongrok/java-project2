package com.example.javaproject2.week5.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
