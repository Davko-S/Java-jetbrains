package pl.davko.jetbrains.excercise.cipherApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {

        String mode = "enc";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                mode = (args[i + 1]);
            }
        }

      Message message = new Message("", "", "", "shift", false, 0);

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-key")) {
                message.setKey(parseInt(args[i + 1]));
            } else if (args[i].equals("-data")) {
                message.setData(args[i + 1]);
            } else if (args[i].equals("-in")) {
                message.setInFile(args[i + 1]);
            } else if (args[i].equals("-out")) {
                message.setOutFile(args[i + 1]);
                message.isOut = true;
            } else if (args[i].equals("-alg")) {
                message.setAlg(args[i + 1]);
            }
        }

        //Reading text from file when necessary

        /*if ("".equals(message.getData()) && !"".equals(message.getInFile())) {
            try {
                File file = new File(message.inFile);
                Scanner scanner = new Scanner(file);
                message.setData(scanner.nextLine());
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        if (message.isOut) {
            try {
                File output = new File(message.outFile);
                if (output.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("File already exist");
                }
                FileWriter writer = new FileWriter(output);
                if (message.getType().equals("enc")) {
                    if (message.getAlg().equals("unicode")) {
                        writer.write(UnicodeMethod.encrypt(message));

            } catch (Exception e) {
                System.out.println(e.getMessage());





        if (message.getType().equals("enc")) {
            if (message.getAlg().equals("unicode")) {
                writer.write(UnicodeMethod.encrypt(message));
            } else {
                writer.write(ShiftMethod.encrypt(message));
            }
            Scanner scanner = new Scanner(message.outFile); // control
            System.out.println(scanner.nextLine()); //control
            writer.close();
        } else {
                System.out.println(ShiftMethod.encrypt(message));
            }
        } else if (message.getType().equals("dec")) {
            if (message.isOut) {
                try {
                    File output = new File(message.outFile);
                    if (output.createNewFile()) {
                        System.out.println("File created");
                    } else {
                        System.out.println("File already exist");
                    }
                    FileWriter writer = new FileWriter(output);
                    if (message.getAlg().equals("unicode")) {
                        writer.write(UnicodeMethod.decrypt(message));
                    } else {
                        writer.write(ShiftMethod.decrypt(message));
                    }
                    writer.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (message.getAlg().equals("shift")) {
                System.out.println(ShiftMethod.decrypt(message));
            } else {
                System.out.println(UnicodeMethod.decrypt(message));
            }
        }*/
    }
}
