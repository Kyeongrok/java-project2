package com.example.javaproject2.week5.algorithm;

public class BracketsSplit {
    public static void main(String[] args) {
        String br = "((((()))))";

        while(br.indexOf("()") >= 0){
            String[] split = br.split("\\(\\)");
            br = String.join("", split);
            System.out.println(br);
        }
        System.out.printf("brackets:%s", br);
    }
}
