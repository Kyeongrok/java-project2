package com.example.javaproject2.week4.d3;

public abstract class ShapeDrawer2{

    protected String symbol;

    public ShapeDrawer2(String symbol) {
        this.symbol = symbol;
    }

    public abstract String makeALine(int h, int i);
//    {
//        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
//    }

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
}
