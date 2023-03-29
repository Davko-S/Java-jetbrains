package pl.davko.jetbrains.excercise.filemanager;

import java.io.File;
import java.text.Normalizer;
import java.util.Formatter;
import java.util.Scanner;

///Formatter class can be used to save contents into a file///

public class FileWriter {
    public static void main(String[] args) {

        /* THE BASICS: how it works
        try {
            Formatter newFormatter = new Formatter("contents_to_file.txt");
            newFormatter.format("%s %s %s", "1", "FUSE:", "Fusing objects to create weapons etc.\r\n");
            newFormatter.format("%s %s %s", "2", "ULTRAHAND:", "Gelling world objects to create new vehicles etc.");
            newFormatter.close();
        } catch (Exception e) {
            System.out.println("Error");
        }*/

        // TO DO list exercise
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while(count < 3) {
                f.format("%s", input.next() + "\n");
                count++;
            }
            f.close();

        } catch (Exception exception) {
            System.out.println("Error");
        }
        readFile();
    }
    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
