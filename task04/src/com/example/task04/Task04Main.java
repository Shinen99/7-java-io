package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = .0d;

        InputStreamReader reader = new InputStreamReader(System.in);
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            sb.appendCodePoint(reader.read());
        }

        String[] values = sb.toString().split("\\s");
        for (String value : values) {
            try {
                sum += Double.parseDouble(value);
            } catch (NumberFormatException ignored){}
        }

        System.out.printf(Locale.ROOT, "%.6f\n", sum);
    }
}
