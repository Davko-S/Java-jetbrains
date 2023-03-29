package pl.davko.jetbrains.excercise.filemanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        try {
            File testFile = new File("road_to_treasure.txt");
            Scanner scanner = new Scanner(testFile);
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
