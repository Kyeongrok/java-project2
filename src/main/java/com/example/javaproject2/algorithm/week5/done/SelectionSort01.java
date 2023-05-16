package com.example.javaproject2.algorithm.week5.done;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {

        int[] arr = {7, 2, 3, 9, 28, 1};
        for (int i = 0; i < arr.length; i++) {
            int targetVal = arr[i];
            int targetIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(targetVal - arr[j] > 0){
                    targetVal = arr[j];
                    targetIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = targetVal;
            arr[targetIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
