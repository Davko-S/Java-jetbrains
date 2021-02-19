package pl.davko.jetbrains.excercise.cipherApp.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmTypeTest {

    @Test
    void checkIfParseReturnsSHIFTWhenUserInputIsShift() {
        String userInput = "shift";
        assertEquals(AlgorithmType.SHIFT, AlgorithmType.parse(userInput));
    }

    @Test
    void checkIfParseReturnsUNICODETWhenUserInputIsUnicode() {
        String userInput = "unicode";
        assertEquals(AlgorithmType.UNICODE, AlgorithmType.parse(userInput));
    }

    @Test
    void checkIfParseReturnsNullWhenUserInputIsNotShiftNorUnicode() {
        String userInput = "other";
        assertEquals(AlgorithmType.UNKNOWN, AlgorithmType.parse(userInput));
    }
}