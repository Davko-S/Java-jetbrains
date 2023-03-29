package pl.davko.jetbrains.excercise.filemanager;

import java.util.Formatter;

///Formatter class can be used to save contents into a file///

public class FileWriter {
    public static void main(String[] args) {
        try {
            Formatter newFormatter = new Formatter("contents_to_file.txt");
            newFormatter.format("%s %s %s", "1", "FUSE:", "Fusing objects to create weapons etc.\r\n");
            newFormatter.format("%s %s %s", "2", "ULTRAHAND:", "Gelling world objects to create new vehicles etc.");
            newFormatter.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
