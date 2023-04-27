package com.example.javaproject2.week2.d4;

public class IncreaseFirst2 {
    public static void main(String[] args) {
        int idx = 0;
        int[] arr = {2, 1, 7, 4};
        System.out.println(arr[idx++]);
        System.out.println(arr[idx++]);
        System.out.println(arr[idx++]);

        int iVal = 4;
        System.out.println(Integer.toBinaryString(iVal));
        System.out.println(Integer.toBinaryString(~iVal));
        System.out.println(Integer.toBinaryString(~iVal).length());

        byte bVal = 4;
        System.out.println(Integer.toBinaryString(bVal));
        System.out.println(Integer.toBinaryString(~bVal));
        System.out.println(Integer.toBinaryString(~bVal).length());

    }
}
