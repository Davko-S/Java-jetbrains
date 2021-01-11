package pl.davko.jetbrains.excercise.potd;

import java.util.Scanner;

public class NutsForSquirrels {

    public static int countNuts() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        return k / n;
    }
}
