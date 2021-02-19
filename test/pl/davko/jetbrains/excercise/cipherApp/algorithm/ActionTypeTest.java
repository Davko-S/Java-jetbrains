package pl.davko.jetbrains.excercise.cipherApp.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActionTypeTest {

    private final ActionType encrypt = ActionType.ENCRYPT;
    private final ActionType decrypt = ActionType.DECRYPT;
    private final ActionType unknown = ActionType.UNKNOWN;

    @Test
    void checkIfParseReturnsENCRYPTWhenUserInputIsEnc() {
        String userInput = "enc";
        assertEquals(encrypt, ActionType.parse(userInput));
    }

    @Test
    void checkIfParseReturnsDECRYPTWhenUserInputIsDec() {
        String userInput = "dec";
        assertEquals(decrypt, ActionType.parse(userInput));
    }

    @Test
    void checkIfParseReturnsNullWhenUserInputIsNotEncNorDec() {
        String userInput = "other";
        assertEquals(unknown, ActionType.parse(userInput));
    }
}