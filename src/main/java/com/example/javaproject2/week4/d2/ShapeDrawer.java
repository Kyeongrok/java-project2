package com.example.javaproject2.week4.d2;

public abstract class ShapeDrawer {

    public void printShape(String[] lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }

    public void printShapeIntoFile() {

    }

    public void printShape(int height) {
        String[] lines = new String[height];

        for (int i = 0; i < height; i++) {
            lines[i] = makeALine(height, i);
        }

        printShape(lines);
    }

    public abstract String makeALine(int h, int i);

}
