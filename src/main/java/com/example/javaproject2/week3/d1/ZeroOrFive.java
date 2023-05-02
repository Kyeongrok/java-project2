package com.example.javaproject2.week3.d1;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while(num > 0){
            int remainder = num % 10;
            if( remainder % 5 != 0 || remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 252;
        // 10으로 나눈 나머지가 5로 나누었을 때 0또는 5인지 check
        boolean r = isZeroOrFive(num);
        System.out.println(r);

    }
}
