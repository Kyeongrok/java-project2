package com.example.javaproject2.week4.d3;

import java.io.IOException;

public class DiamondShapeDrawer2 extends ShapeDrawer2{
    public DiamondShapeDrawer2(String symbol) {
        super(symbol);
    }

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
            return String.format("%s%s\n", getRepeatedSymbolFor(symbol, pivot - i), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor(symbol, i - pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        DiamondShapeDrawer2 diamondShapeDrawer2 = new DiamondShapeDrawer2(" ");
    }

}
