package pl.davko.jetbrains.excercise.cipherApp;

public enum AlgorithmType {
    SHIFT,
    UNICODE,
    UNKNOWN;

    public static AlgorithmType parse(String userInput) {
        try {
            return AlgorithmType.valueOf(userInput.toUpperCase());
        } catch (IllegalArgumentException exception) {
            return UNKNOWN;
        }
    }
}
