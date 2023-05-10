package com.example.javaproject2.week4.abstractclass;

public class PyramidShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer pyramid = new PyramidShapeDrawer();
        pyramid.printShape(4);
    }
}
