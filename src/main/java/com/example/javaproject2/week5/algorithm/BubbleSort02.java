package com.example.javaproject2.week5.algorithm;

import java.util.Arrays;

public class BubbleSort02 {

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
        BubbleSort02 bs = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bs.sort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        arr = bs.sort(arr, arr.length - 2);
        System.out.println(Arrays.toString(arr));
        arr = bs.sort(arr, arr.length - 3);
        System.out.println(Arrays.toString(arr));
        arr = bs.sort(arr, arr.length - 4);
        System.out.println(Arrays.toString(arr));
        arr = bs.sort(arr, arr.length - 5);
        System.out.println(Arrays.toString(arr));
    }
}
