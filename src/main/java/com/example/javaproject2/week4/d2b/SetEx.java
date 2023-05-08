package com.example.javaproject2.week4.d2b;

import java.util.HashSet;
import java.util.Random;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            Random ran = new Random();
            hs.add(ran.nextInt(1000));
        }
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
