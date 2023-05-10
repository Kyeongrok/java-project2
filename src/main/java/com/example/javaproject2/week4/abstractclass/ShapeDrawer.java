package com.example.javaproject2.week4.abstractclass;

public abstract class ShapeDrawer {
    // 직각삼각형, 피라미드, 마름모, 평행사변형 ...

    public abstract String makeALine(int h, int i);
//    {
//        return String.format("%s%s\n", "", "*".repeat(i));
//    }
    public void printShape(int h) {
        // 출력, 반복
        for (int i = 1; i <= h; i++) {
            System.out.printf("%s", makeALine(h, i));
        }
    }
}
