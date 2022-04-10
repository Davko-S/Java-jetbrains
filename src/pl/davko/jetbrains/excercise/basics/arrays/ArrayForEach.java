package pl.davko.jetbrains.excercise.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayForEach {

    public static void addGreaterThan() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
//        int[] array = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int a: array) {
            if (a > n) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    public static boolean containsTwoInt() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i < array.length; i++) {
            if (n == array[i - 1] && m == array[i] || n == array[i] && m == array[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
