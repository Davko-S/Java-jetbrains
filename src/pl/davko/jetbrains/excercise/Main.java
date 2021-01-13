package pl.davko.jetbrains.excercise;

import pl.davko.jetbrains.excercise.potd.IntMultiplication;
import pl.davko.jetbrains.excercise.potd.NutsForSquirrels;
import pl.davko.jetbrains.excercise.potd.VowelChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long product = 1;
        for (int i = a; i < b; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}

