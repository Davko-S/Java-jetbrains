package pl.davko.jetbrains.excercise.cipherApp;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.ActionType;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.AlgorithmType;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.CipherAction;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.factory.CipherActionFactory;
import pl.davko.jetbrains.excercise.cipherApp.file.FileManager;

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

        // Reading data from file if necessary i.e. not given in args[]

        if ("".equals(data) && !"".equals(inFile)) {
            data = FileManager.readDataFromFile(inFile);
        }

        // Core application

        CipherAction cipherAction = new CipherActionFactory().make(actionType, algorithmType);
        String result = cipherAction.invoke(data, key);

        // Printing result on screen or to the file

        System.out.println(isOut ? FileManager.writeDataToFile(result, outFile) : result);
    }
}