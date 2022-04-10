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

    public static void colorMatrix() {

        Scanner scanner = new Scanner(System.in);

        String rowOne = scanner.nextLine();
        String rowTwo = scanner.nextLine();
        String rowThree = scanner.nextLine();
        String rowFour = scanner.nextLine();

        char[] one = rowOne.toCharArray();
        char[] two = rowTwo.toCharArray();
        char[] three = rowThree.toCharArray();
        char[] four = rowFour.toCharArray();

        boolean isPretty = true;

        for (int i = 0; i < 3; i++) {
            if (one[i] == two[i] && one[i] == one[i + 1] && one[i] == two[i + 1]) {
                isPretty = false;
            } else if (two[i] == three[i] && two[i] == two[i + 1] && two[i + 1] == three[i + 1]) {
                isPretty = false;
            } else if (three[i] == four[i] && three[i] == three[i + 1] && three[i + 1] == four[i + 1]) {
                isPretty = false;
            }
        }
//        System.out.println(Arrays.toString(one));
//        System.out.println(Arrays.toString(two));
//        System.out.println(Arrays.toString(three));
//        System.out.println(Arrays.toString(four));

        System.out.println(isPretty ? "YES" : "NO");


    }
}
