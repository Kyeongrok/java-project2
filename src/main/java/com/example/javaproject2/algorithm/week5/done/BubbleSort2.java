package com.example.javaproject2.algorithm.week5.done;

import java.util.Arrays;

public class BubbleSort2 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort2 bubbleSort2 = new BubbleSort2();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubbleSort2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
