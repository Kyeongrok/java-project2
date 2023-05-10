package com.example.javaproject2.week4.d3;

import com.example.javaproject2.week4.d2.ShapeDrawer;

public class DiamondShapeDrawer extends ShapeDrawer {
    public String getRepeatedSymbolFor(String symbol, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += symbol;
        }
        return answer;
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot){
            return String.format("%s%s\n", getRepeatedSymbolFor("0", pivot - i), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor("0", i - pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new DiamondShapeDrawer();
        shapeDrawer.printShape(7);
    }
}
