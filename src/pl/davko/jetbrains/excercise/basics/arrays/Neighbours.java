package pl.davko.jetbrains.excercise.basics.arrays;

import java.util.Scanner;

public class Neighbours {

    public static void sumOfNeighbours() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int rows = -1;

        while (!input.equals("end")) {
            input = scanner.nextLine();
            rows++;
        }
        System.out.println(rows);
    }
}
