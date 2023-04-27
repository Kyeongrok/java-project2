package com.example.javaproject2.programmers;

import java.math.BigDecimal;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            String bin = Integer.toBinaryString(arr1[i] | arr2[i]);
            strArr[i] = bin.replace("1", "#").replace("0", " ");
            // 자릿수 보정 로직
            strArr[i] = " ".repeat(n - strArr[i].length()) + strArr[i];
        }
        return strArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        solution(5, arr1, arr2);

    }
}
