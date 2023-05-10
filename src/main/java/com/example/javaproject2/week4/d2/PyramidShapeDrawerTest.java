package com.example.javaproject2.week4.d2;

import java.util.Scanner;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {

        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        shapeDrawer.printShape(4);

        ShapeDrawer parallelogramSD = new ParallelogramShapeDrawer();
        parallelogramSD.printShape(5);
    }
}
