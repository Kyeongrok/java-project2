package com.example.javaproject2.week5.addtional;

public class RightTriangleShapePrinter extends ShapePrinter{
    @Override
    public String makeALine(int h, int i) {
        return "*".repeat(i);
    }

    public static void main(String[] args) {
        ShapePrinter sp = new RightTriangleShapePrinter();
        sp.repeat(7);
    }
}
