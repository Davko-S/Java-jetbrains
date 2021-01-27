package pl.davko.jetbrains.excercise.basics.arrays;
import java.util.Scanner;

public class LongestSequence {

    public static void countSequence() {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();     // Size of input array
        int[] ints = new int[length];

        if (length == 1) {
            System.out.println("1");
        } else {
            for (int i = 0; i < length; i++) {
                ints[i] = scanner.nextInt();
                System.out.print(ints[i] + " ");
            }
            System.out.println();

            // Count the length of ascending sequence
            int oldCounter = 1;
            int counter = 1;
            for (int i = 1; i < ints.length; i++) {
                if (ints[i] > ints[i - 1]) {
                    counter++;
                } else {
                    if (counter > oldCounter)
                        oldCounter = counter;
                        counter = 1;
                }
            }
            System.out.println(Math.max(counter, oldCounter));
        }
    }
}
