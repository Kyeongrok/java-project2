package com.example.javaproject2.week4.d2b;

import java.util.HashMap;

public class MapIterator {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.putIfAbsent("a", 1);
        hm.putIfAbsent("b", 1);
        hm.putIfAbsent("c", 1);

        for (String strKey : hm.keySet()) {
            System.out.println(strKey);
        }
    }
}
