package com.example.javaproject2.algorithm.week5.done;

import java.util.Arrays;

public class BubbleSort {

    private int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            arr = sortARound(arr, arr.length - i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
