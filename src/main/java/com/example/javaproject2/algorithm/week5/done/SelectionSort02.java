package com.example.javaproject2.algorithm.week5.done;

import java.util.Arrays;

public class SelectionSort02 {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 0; i < arr.length; i++) {
            int targetVal = arr[i];
            int targetIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if ((isAscending ? targetVal - arr[j] : arr[j] - targetVal) > 0) {
                    targetVal = arr[j];
                    targetIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = targetVal;
            arr[targetIdx] = temp;
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        sort(arr, true);
        return arr;
    }
    public static void main(String[] args) {
        SelectionSort02 ss = new SelectionSort02();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = ss.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}
