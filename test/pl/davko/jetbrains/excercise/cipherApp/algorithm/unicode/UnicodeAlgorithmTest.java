package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnicodeAlgorithmTest {

    private void basicCharUnicodeTest(char inputChar, char expectedChar, int key) {
        UnicodeAlgorithm algorithm = new UnicodeAlgorithm();
        char character = algorithm.changeChar(inputChar, key);
        assertEquals(expectedChar, character);
    }

    @Test
    void checkIfAChangesToBWhenKeyIs1() {
        basicCharUnicodeTest('a', 'b', 1);
    }

    @Test
    void checkIfBChangesToAWhenKeyIsMinus1() {
        basicCharUnicodeTest('b', 'a', -1);
    }

    @Test
    void checkIfAChangesToOtherSymbolWhenKeyIsNegative() {
        basicCharUnicodeTest('a', '`', -1);
    }

    @Test
    void checkIfZChangesToOtherSymbolWhenKeyIsPositive() {
        basicCharUnicodeTest('z', '|', 2);
    }

    @Test
    void checkIfADoesNotChangeIfKeyIs0() {
        basicCharUnicodeTest('A', 'A', 0);
    }

    @Test
    void checkIfWhiteSpaceIsChanged() {
        basicCharUnicodeTest(' ', '!', 1);
    }

    @Test
    void checkIfNonLetterCharIsChanged() {
        basicCharUnicodeTest('&', '0', 10);
    }
}