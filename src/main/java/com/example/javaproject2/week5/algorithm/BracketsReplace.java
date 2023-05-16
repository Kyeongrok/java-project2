package com.example.javaproject2.week5.algorithm;

public class BracketsReplace {
    public static void main(String[] args) {
        String br = "((((()))))";

        while(br.indexOf("()") >= 0){
            br = br.replace("()", "");
        }
        System.out.printf("brackets:%s", br);
    }
}
