package pl.davko.jetbrains.excercise.basics.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Neighbours {

    public static void sumOfNeighbours() {
        Scanner scanner = new Scanner(System.in);

        //Pass first line of input as String and then continue within while loop
        String input = scanner.nextLine();

        //Initializing an ArrayList to be able to add rows dynamically depending on user's input
        ArrayList<int[]> arrayRow = new ArrayList<>();

        //Loop which changes input String via String[] to int[] array and makes calculations
        while (!"end".equals(input)) {

            String[] numbers = input.split(" ");
            int[] array = new int[numbers.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            //Adding each input line as a new row to ArrayList
            arrayRow.add(array);
            input = scanner.nextLine();
        }
        //Converting ArrayList<int[]> to int[][]
        int[][] array = arrayRow.toArray(new int[arrayRow.size()][]);
        int[][] results = new int[array.length][array[0].length];

        //Printing the results as output after calculations
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                results[i][j] = array[(i - 1 + array.length) % array.length][j % array[i].length]
                        + array[(i + 1) % array.length][j % array[i].length]
                        + array[i % array.length][(j - 1 + array[i].length) % array[i].length]
                        + array[i % array.length][(j + 1) % array[i].length];
                System.out.print(results[i][j] + " ");
            }
            System.out.println();
        }
    }
}
