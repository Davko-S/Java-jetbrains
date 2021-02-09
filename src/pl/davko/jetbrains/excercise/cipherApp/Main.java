package pl.davko.jetbrains.excercise.cipherApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variables for content given via args[]

        ActionType actionType = ActionType.ENCRYPT;
        String data = "";
        String inFile = "";
        String outFile = "";
        AlgorithmType algorithmType = AlgorithmType.UNKNOWN;
        boolean isOut = false;
        int key = 0;

        //Reading the parameters from input

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                actionType = ActionType.parse(args[i + 1]);
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-data")) {
                data = args[i + 1];
            } else if (args[i].equals("-in")) {
                inFile = args[i + 1];
            } else if (args[i].equals("-out")) {
                outFile = args[i + 1];
                isOut = true;
            } else if (args[i].equals("-alg")) {
                algorithmType = AlgorithmType.parse(args[i + 1]);
            }
        }

        //Reading text from file when necessary

        if ("".equals(data) && !"".equals(inFile)) {
            try {
                File file = new File(inFile);
                Scanner scanner = new Scanner(file);
                data = scanner.nextLine();
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        //Deciding: encryption or decryption

        if (actionType == ActionType.ENCRYPT) {
            if (isOut) {
                try {
                    File output = new File(outFile);
                    if (output.createNewFile()) {
                        System.out.println("File created");
                    } else {
                        System.out.println("File already exist");
                    }
                    FileWriter writer = new FileWriter(output);
                    writer.write(encryptString(data, key, algorithmType));
                    //Scanner scanner = new Scanner(outFile);  control
                    //System.out.println(scanner.nextLine()); //control
                    writer.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println(encryptString(data, key, algorithmType));
            }
        } else if (actionType == ActionType.DECRYPT) {
            if (isOut) {
                try {
                    File output = new File(outFile);
                    if (output.createNewFile()) {
                        System.out.println("File created");
                    } else {
                        System.out.println("File already exist");
                    }
                    FileWriter writer = new FileWriter(output);
                    writer.write(decryptString(key, data, algorithmType));
                    writer.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println(decryptString(key, data, algorithmType));
            }
        } else {
            System.out.println("You are an idiot!");
        }
    }

    //Encryption method with added algorithm type as parameter
    public static String encryptString(String s, int key, AlgorithmType algorithmType) {
        char[] ourString = s.toCharArray();
        if (algorithmType == AlgorithmType.UNICODE) {
            for (int i = 0; i < ourString.length; i++) {
                ourString[i] = changeChar(ourString[i], key);
            }
            return new String(ourString);
        } else {
            for (int i = 0; i < ourString.length; i++) {
                ourString[i] = changeCharShift(ourString[i], key);
            }
            return new String(ourString);
        }
    }

    //Decryption method with added algorithm type as parameter
    public static String decryptString(int key, String s, AlgorithmType algorithmType) {
        char[] ourString = s.toCharArray();
        if (algorithmType == AlgorithmType.UNICODE) {
            for (int i = 0; i < ourString.length; i++) {
                ourString[i] = changeChar(ourString[i], (-1) * key);
            }
            return new String(ourString);
        } else {
            for (int i = 0; i < ourString.length; i++) {
                ourString[i] = changeCharShift(ourString[i], 26 - (key % 26));
            }
            return new String(ourString);
        }
    }

    public static char changeChar(char c, int key) {
        return (char) (c + key);
    }

    public static char changeCharShift(char c, int key) {
        if (c == ' ') {
            return c;
        } else if ((int) c < 97) {
            int originalPosition = c - 'A';
            int newPosition = (originalPosition + key) % 26;
            return (char) ('A' + newPosition);
        } else {
            int originalPosition = c - 'a';
            int newPosition = (originalPosition + key) % 26;
            return (char) ('a' + newPosition);
        }
    }
}
