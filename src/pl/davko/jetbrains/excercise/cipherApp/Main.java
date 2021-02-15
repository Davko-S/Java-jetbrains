package pl.davko.jetbrains.excercise.cipherApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variables for input from args[]

        ActionType actionType = ActionType.ENCRYPT;
        String data = "";
        String inFile = "";
        String outFile = "";
        AlgorithmType algorithmType = AlgorithmType.UNKNOWN;
        boolean isOut = false;
        int key = 0;

        //Reading the parameters from input

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode" -> actionType = ActionType.parse(args[i + 1]);
                case "-key" -> key = Integer.parseInt(args[i + 1]);
                case "-data" -> data = args[i + 1];
                case "-in" -> inFile = args[i + 1];
                case "-out" -> {
                    outFile = args[i + 1];
                    isOut = true;
                }
                case "-alg" -> algorithmType = AlgorithmType.parse(args[i + 1]);
            }
        }

        //Reading data from file when necessary

        if ("".equals(data) && !"".equals(inFile)) {
            try {
                File file = new File(inFile);
                Scanner scanner = new Scanner(file);
                data = scanner.nextLine();
                scanner.close();
            } catch (FileNotFoundException noFileException) {
                System.out.println(noFileException.getMessage());
            }
        }

        // Core application
        CipherAction cipherAction = new CipherActionFactory().make(actionType, algorithmType);
        String result = cipherAction.invoke(data, key);

        // Printing result on screen or to the file
        if (isOut) {
            try {
                File output = new File(outFile);
                if (output.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("File already exist - data overwritten!");
                }
                FileWriter writer = new FileWriter(output);
                writer.write(result);
                writer.close();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            System.out.println(result);
        }
    }
}
