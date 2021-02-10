package pl.davko.jetbrains.excercise.cipherApp;

public class InputManager {

    public static void parseArguments(String[] inputArgs) {

        ActionType actionType = ActionType.ENCRYPT;
        String data = "";
        String inFile = "";
        String outFile = "";
        AlgorithmType algorithmType = AlgorithmType.UNKNOWN;
        boolean isOut = false;
        int key = 0;

        //Reading the parameters from input

        for (int i = 0; i < inputArgs.length; i++) {
            switch (inputArgs[i]) {
                case "-mode" -> actionType = ActionType.parse(inputArgs[i + 1]);
                case "-key" -> key = Integer.parseInt(inputArgs[i + 1]);
                case "-data" -> data = inputArgs[i + 1];
                case "-in" -> inFile = inputArgs[i + 1];
                case "-out" -> {
                    outFile = inputArgs[i + 1];
                    isOut = true;
                }
                case "-alg" -> algorithmType = AlgorithmType.parse(inputArgs[i + 1]);
            }
        }
    }
}
