package com.example.javaproject2.week5.algorithm;

import java.util.Arrays;

public class BubbleSort04 {

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int i = 1; i <= arr.length - 1 ; i++) {
            arr = sortARound(arr, arr.length - i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort04 bs = new BubbleSort04();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
