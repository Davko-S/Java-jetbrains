package pl.davko.jetbrains.excercise.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void lineToInt (File file) {
        try (Scanner scanner = new Scanner(file)) {
            int counter = 0;
            while (scanner.hasNext()) {
                int number = Integer.parseInt(scanner.next());
                if (number >= 9999) {
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }
    }
}
