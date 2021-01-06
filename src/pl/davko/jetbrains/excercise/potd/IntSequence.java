package pl.davko.jetbrains.excercise.potd;

import java.util.Scanner;

public class IntSequence {

    /*The program takes int sequence as input value and stops when the sum is either > 1000 or if user inputs 0*/

    public static int loopAdd() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = n - 1000;
        if (n < 1000) {
            sum = n;
            while (n > 0) {
                n = scanner.nextInt();
                if (sum < 1000) {
                    sum = sum + n;
                } else {
                    sum = sum - 1000;
                }
            }
        }
        return sum;
    }
}
