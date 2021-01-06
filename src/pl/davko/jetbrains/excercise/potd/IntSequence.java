package pl.davko.jetbrains.excercise.potd;

import java.util.Scanner;

public class IntSequence {

    public static int loopAdd() {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int result = first - 1000;
        if (first < 1000) {
            int sum = first;
            while (first > 0) {
                first = scanner.nextInt();
                if (sum < 1000) {
                    sum = sum + first;
                    result = sum;
                } else {
                    result = sum - 1000;
                }
            }
        }
        return result;
    }
}
