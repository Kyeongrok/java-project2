package com.example.javaproject2.codeup.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P120852 {
    public static void main(String[] args) {
        int n = 12;
        int[] arr = new int[n];
        int idx = 0;
        int divisor = 2;
        while (n > 1) {
            if(n % divisor == 0){
                arr[idx++] = divisor;
                n /= divisor;
            } else {
                divisor ++;
            }
        }
        int[] answer = Arrays.copyOfRange(arr, 0, idx);
        System.out.println(Arrays.toString(answer));
    }
}
