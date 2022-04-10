package pl.davko.jetbrains.excercise.potd;

import java.util.Scanner;

public class CollatzConjecture {

    public static void generateCollatz() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(num + " ");
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            System.out.print(num + " ");
        }
    }
}
