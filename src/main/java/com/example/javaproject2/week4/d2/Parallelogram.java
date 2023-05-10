package com.example.javaproject2.week4.d2;

public class Parallelogram {

    public void printSth(String spaceChar) {

    }
    public String makeALine(String spaceChar, int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }
    public void printShape(String spaceChar, int h) {
        for (int i = 0; i < h; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
        }
    }
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram();
        int h = 4;
        parallelogram.printShape("0", h);
    }
}
