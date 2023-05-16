package com.example.javaproject2.week5.algorithm;

import java.util.Stack;

public class BracketsStack {
    public boolean solution(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        BracketsStack bs = new BracketsStack();
        System.out.println(bs.solution("()()()(()))"));
    }
}
