package com.example.javaproject2.week4.d2b;

import java.util.HashMap;

public class MapPutIfAbsent {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.putIfAbsent("a", 1);
        hm.putIfAbsent("b", 1);
        hm.putIfAbsent("c", 1);
    }
}
