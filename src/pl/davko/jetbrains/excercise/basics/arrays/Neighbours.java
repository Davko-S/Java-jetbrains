package pl.davko.jetbrains.excercise.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Neighbours {

    public static void sumOfNeighbours() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] numbers = input.split(" ");
            int[] array = new int[numbers.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            for (int n : array) {
                System.out.print(n + " ");
            }
            System.out.println();
            input = scanner.nextLine();
        }


    }
}
