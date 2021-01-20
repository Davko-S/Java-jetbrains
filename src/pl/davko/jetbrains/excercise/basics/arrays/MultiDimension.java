package pl.davko.jetbrains.excercise.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void make3dArray(int arrays, int rows, int fields) {

        int[][][] cubic = new int[arrays][rows][fields];

        //*** Keeping the value for entries in the first array
        int current = 1;

        //*** Filling the fields of each row of each array
        for (int i = 0; i < arrays; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < fields; k++) {
                    cubic[i][j][k] = current;
                }
            }
            current++;
        }

        //*** Printing out the fields in blocks (matrix)
        for (int i = 0; i < arrays; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < fields; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

        //*** Alternative with foreach loop
        /*for (int[][] dim2Array : cubic) {     // for each 2-dim array
            for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
                Arrays.fill(vector, current); // fill the vector
            }
            current++; // the next current
        }

        // this code prints all 2-dimensional arrays
        for (int[][] dim2Array : cubic) {
            for (int[] vector : dim2Array) {
                System.out.println(Arrays.toString(vector));
            }
            System.out.println();
        }*/
    }

    public static void diagonalArray() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.abs(i-j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
