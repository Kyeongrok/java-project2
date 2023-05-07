package com.example.javaproject2.codeup.e1000;

import java.util.Arrays;
import java.util.Scanner;
public class Codeup1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            arr[idx++] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
