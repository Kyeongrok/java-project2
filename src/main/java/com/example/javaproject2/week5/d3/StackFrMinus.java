package com.example.javaproject2.week5.d3;

public class StackFrMinus {
    private int[] arr = new int[10000];
    private int pointer = -1;

    public void push(int value) {
        this.arr[++pointer] = value;
    }

    public int pop() {
        return this.arr[pointer--];
    }

    public static void main(String[] args) {
        StackFrMinus st2 = new StackFrMinus();
        st2.push(10);
        System.out.println(st2.pop());
    }
}
