package com.company;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int divisor = 0;
        double avg;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                divisor++;
            }
        }
        avg = (double) sum / divisor;
        System.out.println(avg);
    }
}

