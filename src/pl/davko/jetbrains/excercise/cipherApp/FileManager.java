package pl.davko.jetbrains.excercise.cipherApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static String readDataFromFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            String data = scanner.nextLine();
            scanner.close();
            return data;
        } catch (FileNotFoundException noFileException) {
            System.out.println(noFileException.getMessage());
            return "Wrong filepath!";
        }
    }

    public static String writeDataToFile(String result, String filePath) {
        try {
            File output = new File(filePath);
            String fileStatus;
            if (output.createNewFile()) {
                fileStatus = "New file created. \nData saved in: " + filePath;
            } else {
                fileStatus = "File already exists. \nData overwritten in: " + filePath;
            }
            FileWriter writer = new FileWriter(output);
            writer.write(result);
            writer.close();
            return fileStatus;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return "Could not create a file";
        }
    }
}
