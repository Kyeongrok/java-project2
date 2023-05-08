package com.example.javaproject2.week4.d2b;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.remove(l1.size() - 1);
        System.out.println(l1);
    }
}
