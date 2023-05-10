package com.example.javaproject2.week4.inter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer{
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./bye.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
