package pl.davko.jetbrains.excercise.potd;

import java.util.Scanner;

public class ShapePicker {

    public static void pickShape() {
        Scanner scanner = new Scanner(System.in);
        int shape = scanner.nextInt();

        switch (shape) {
            case 1 -> System.out.println("You have chosen a square");
            case 2 -> System.out.println("You have chosen a circle");
            case 3 -> System.out.println("You have chosen a triangle");
            case 4 -> System.out.println("You have chosen a rhombus");
            default -> System.out.println("There is no such shape!");
        }
    }
}
