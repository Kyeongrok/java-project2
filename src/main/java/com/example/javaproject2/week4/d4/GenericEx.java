package com.example.javaproject2.week4.d4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // 문자형
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for (String item : strList) {
            System.out.println(item);
        }

        for (int item : intList) {
            System.out.println(item);
        }

    }
}
