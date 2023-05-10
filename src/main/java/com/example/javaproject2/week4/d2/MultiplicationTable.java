package com.example.javaproject2.week4.d2;

public class MultiplicationTable {
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        // 2, 5, 7, 8
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(2);
        mt.printDan(5);
        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(7);
        mt2.printDan(8);
    }
}
