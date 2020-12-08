package pl.davko.jetbrains.excercise;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import pl.davko.jetbrains.excercise.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean willCrash = false;
        int bridgeId = 0;

        for (int i = 0; i < bridges; i++) {
            int bH = scanner.nextInt();
            if (bH <= height && !willCrash) {
                bridgeId = i + 1;
                willCrash = true;
            }
        }
        System.out.println(willCrash ? "Will crash on bridge " + bridgeId : "Will not crash");
    }
}

