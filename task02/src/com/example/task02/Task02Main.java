package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        while (System.in.available() > 0) {
            int firstByte = System.in.read();
            System.in.mark(1);
            int secondByte = System.in.read();
            if (!(firstByte == '\r' && secondByte == '\n')) {
                System.out.write(firstByte);
            }
            System.in.reset();
        }

        System.out.flush();
    }
}
