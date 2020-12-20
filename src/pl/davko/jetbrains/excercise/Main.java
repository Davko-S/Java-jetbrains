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

        String firstName = scanner.next();
        String secondName = scanner.next();

        System.out.println(connectNames(firstName, secondName));

    }

    public static String connectNames(String firstName, String secondName) {
        return firstName + " " + secondName;
    }
}

