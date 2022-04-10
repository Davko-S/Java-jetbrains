package pl.davko.jetbrains.excercise.cipherApp.algorithm;

public enum ActionType {
    ENCRYPT("enc"),
    DECRYPT("dec"),
    UNKNOWN(null);

    private final String userInput;

    ActionType(String userInput) {
        this.userInput = userInput;
    }

    public static ActionType parse(String userInput) {
        try {
            return ActionType.valueOf(userInput.toUpperCase());
        } catch (IllegalArgumentException exception) {
            if (userInput.toLowerCase().equals(ENCRYPT.userInput)) {
                return ENCRYPT;
            } else if (userInput.toLowerCase().equals(DECRYPT.userInput)) {
                return DECRYPT;
            } else {
                return UNKNOWN;
            }
        }
    }
}
