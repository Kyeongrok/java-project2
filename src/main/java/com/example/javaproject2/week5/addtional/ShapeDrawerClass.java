package com.example.javaproject2.week5.addtional;

public class ShapeDrawerClass {

    private ShapeDrawer shapeDrawer;

    public ShapeDrawerClass(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void repeat(int h) {
        for (int i = 1; i < h; i++) {
            System.out.println(shapeDrawer.makeALine(h, i));
        }
    }
}
