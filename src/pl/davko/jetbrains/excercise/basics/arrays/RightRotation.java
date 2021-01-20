package pl.davko.jetbrains.excercise.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {

    public static void rightRotation() {
        Scanner scanner = new Scanner(System.in);

        //*** int[] passed as Stream from Scanner(System.in)
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //*** Setting variables for rotation and result int[]
        int rotation = scanner.nextInt();
        int[] newArray = new int[array.length];


        //*** Core program function: index gets changed x rotation
        for (int i = 0; i < array.length; i++) {
            int newIndex;
            if (array[i] + rotation >= array.length) {
                newIndex = (i + rotation) % array.length;
            } else {
                newIndex = i + rotation;
            }
            newArray[newIndex] = array[i];
        }

        //*** Printing using Arrays.toString()
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

        //*** Printing using for each loop
        for (int before: array) {
            System.out.print(before + " ");
        }
        System.out.println("");
        for (int after: newArray) {
            System.out.print(after + " ");
        }
    }
}