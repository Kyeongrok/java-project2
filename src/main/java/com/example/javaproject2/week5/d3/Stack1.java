package com.example.javaproject2.week5.d3;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
    }

    public int peek() {
        /*
        push(10);
        0  1
        10 0 pointer:1
         */
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        System.out.println(st.peek());

    }
}
