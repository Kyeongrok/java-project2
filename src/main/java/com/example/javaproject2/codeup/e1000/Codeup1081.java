package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;
public class Codeup1081 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int frontDice = sc.nextInt(); // 자주 바뀜
        int backDice = sc.nextInt(); // 나중에 바뀜

        // 바깥쪽 3번
        // 안쪽 2번
        for (int j = 1; j <= frontDice; j++) {
            for (int i = 1; i <= backDice; i++) { // 2면체 주사위
                System.out.printf("%d %d\n", j, i);
            }
        }
    }
}
