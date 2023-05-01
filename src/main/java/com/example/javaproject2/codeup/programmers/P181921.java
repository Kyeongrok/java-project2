package com.example.javaproject2.codeup.programmers;

import java.util.Scanner;

public class P181921 {
    public static boolean isZeroOr5(int num) {
        while(num > 0){
            int digitOf1 = num % 10;
            if(digitOf1 != 0 && digitOf1 != 5){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public int[] solution(int l, int r) {
        int[] arr = new int[r - l];
        int cnt = 0;
        for (int i = l; i <= r ; i++) {
            if(isZeroOr5(i)){
                arr[cnt++] = i;
            }
        }

        if (cnt > 0) {
            int[] answer = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                answer[i] = arr[i];
            }
            return answer;
        } else {
            return new int[]{-1};
        }
    }

}
