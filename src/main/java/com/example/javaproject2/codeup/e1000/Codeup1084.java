package com.example.javaproject2.codeup.e1000;

import java.io.*;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // .println .printf --> 자동차에 타는 시간...
        int cnt = 0;
        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                String line = "";
                for (int k = 0; k < blue; k++) {
                    line += i + " " + j + " " + k + "\n";
                    cnt += 1;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}
