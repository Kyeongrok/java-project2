package com.example.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }

    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        // soutv, soutm
        System.out.println("asciiCode1 = " + asciiCode1);
        System.out.println("asciiCode2 = " + asciiCode2);

    }
}
