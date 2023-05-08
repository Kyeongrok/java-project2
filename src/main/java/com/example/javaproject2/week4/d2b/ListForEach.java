package com.example.javaproject2.week4.d2b;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);

        for (Integer item : l1) {
            System.out.println(item);
        }
    }
}
