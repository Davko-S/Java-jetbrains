package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnicodeAlgorithmTest {

    private void basicCharShift(char inputChar, char expectedChar, int key) {
        UnicodeAlgorithm algorithm = new UnicodeAlgorithm();
        char character = algorithm.changeChar(inputChar, key);
        assertEquals(expectedChar, character);
    }

    @Test
    void checkIfAChangesToBWhenKeyIs1() {
        basicCharShift('a', 'b', 1);
    }

    @Test
    void checkIfBChangesToAWhenKeyIsMinus1() {
        basicCharShift('b', 'a', -1);
    }

    @Test
    void checkIfAChangesToOtherSymbolWhenKeyIsNegative() {
        basicCharShift('a', '`', -1);
    }

    @Test
    void checkIfZChangesToOtherSymbolWhenKeyIsPositive() {
        basicCharShift('z', '|', 2);
    }

    @Test
    void checkIfADoesNotChangeIfKeyIs0() {
        basicCharShift('A', 'A', 0);
    }

    @Test
    void checkIfWhiteSpaceIsChanged() {
        basicCharShift(' ', '!', 1);
    }

    @Test
    void checkIfNonLetterCharIsChanged() {
        basicCharShift('&', '0', 10);
    }
}