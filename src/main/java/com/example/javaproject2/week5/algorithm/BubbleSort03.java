package com.example.javaproject2.week5.algorithm;

import java.util.Arrays;

public class BubbleSort03 {

    public int[] sort(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort03 bs = new BubbleSort03();
        int[] arr = {7, 2, 3, 9, 28, 11};
        for (int i = 1; i <= arr.length - 1 ; i++) {
            arr = bs.sort(arr, arr.length - i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
