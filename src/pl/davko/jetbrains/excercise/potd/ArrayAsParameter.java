package pl.davko.jetbrains.excercise.potd;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAsParameter {

    public static void addValueByIndex(long[] array, int index, long value) {
        array[index] = array[index] + value;
    }

    public static void makeArrayFromScanner() {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        addValueByIndex(array, 2, 100);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
