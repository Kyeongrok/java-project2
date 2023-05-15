package com.example.javaproject2.week5.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort05 {

    private Comparator<Integer> comparator;

    public BubbleSort05(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < until; i++) {

            if(comparator.compare(arr[i], arr[i+1]) > 0) {
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
        BubbleSort05 bs = new BubbleSort05(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1이 크다면 o1 - o2 는 0보다 큽니다.
                // o2가 크다면 o2 - o1 는 0보다 큽니다.
                return o2 - o1;
            }
        });
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
