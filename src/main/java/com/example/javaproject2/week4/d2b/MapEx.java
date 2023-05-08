package com.example.javaproject2.week4.d2b;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {

        String s1 = "aabbccddefgh///ijk:kkhttps://www.kkllm";
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 0);
        hm.put("b", 0);

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

    }
}
