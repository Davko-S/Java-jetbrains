package pl.davko.jetbrains.excercise.potd;

import java.util.Scanner;

public class CollatzConjecture {

    public static void generateCollatz() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(n);
        } else if (n <= 0 ) {
            System.out.println("Please provide natural number!");
        } else if (n == 2) {
            System.out.println(n + " " + 1);
        } else {
            int next = 0;
            System.out.print(n + " ");
            if (n % 2 == 0) {
                next = n / 2;
            } else {
                next = 3 * n + 1;
            }
            int newNext = next;
            System.out.print(next + " ");
            do {
                if (next % 2 == 0) {
                    newNext = next / 2;
                } else {
                    newNext = next * 3 + 1;
                }
                next = newNext;
                System.out.print(newNext + " ");
            } while (newNext != 1);
        }
    }
}
