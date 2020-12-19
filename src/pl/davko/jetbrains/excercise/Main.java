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
import pl.davko.jetbrains.excercise.factory.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String result = "";

        if (word.length() > 2 && word.length() % 2 == 0) {
            result = word.substring(0, word.length() / 2 - 1) + word.substring(word.length() / 2 + 1);
            } else if (word.length() > 2) {
            result = word.substring(0, (word.length() - 1) / 2) + word.substring((word.length() - 1) / 2 + 1);
        }
        System.out.println(result);
    }
}

