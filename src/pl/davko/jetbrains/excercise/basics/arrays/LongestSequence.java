package pl.davko.jetbrains.excercise.basics.arrays;
import java.util.Scanner;

public class LongestSequence {

    public static void countSequence() {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] ints = new int[length];

        // Checking if sequence length is one or longer
        if (length == 1) {
            System.out.println("1");
        } else {
            for (int i = 0; i < length; i++) {
                ints[i] = scanner.nextInt();
            }

            // Count the length of ascending sequence
            int oldCounter = 1;
            int counter = 1;
            for (int i = 1; i < ints.length; i++) {
                if (ints[i] > ints[i - 1]) {
                    counter++;
                } else {
                    if (counter > oldCounter) {
                        oldCounter = counter;
                        counter = 1;
                    }
                }
            }
            System.out.println(Math.max(counter, oldCounter));
        }
    }
}
