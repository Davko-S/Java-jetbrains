package pl.davko.jetbrains.excercise.basics.arrays;
import java.util.Scanner;

public class LongestSequence {

    public static void countSequence() {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();     // Size of input array
        String input = scanner.nextLine();

        if (length == 1) {
            System.out.println("1");
        }

        String[] numbers = input.split("");
        int[] ints = new int[length];

        for (int i = 0; i < length; i++) {
            ints[i] = Integer.parseInt(numbers[i]);
        }

        // Count the length of ascending sequence
        int oldCounter = 1;
        int counter = 1;
        for (int i = 1; i <= ints.length; i++) {
            if (ints[i] > ints[i - 1]) {
                counter++;
            } else {
                if (counter > oldCounter)
                oldCounter = counter;
            }
        }
        System.out.println(oldCounter);
    }
}
