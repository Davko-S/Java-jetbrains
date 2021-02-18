package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftAlgorithmTest {

    private void basicCharShift(char inputChar, char expectedChar, int key) {
        ShiftAlgorithm algorithm = new ShiftAlgorithm();
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
    void checkIfADoesNotChangeIfKeyIs0() {
        basicCharShift('A', 'A', 0);
    }

    @Test
    void checkIfALoopsBackToAWhenKeyIs26() {
        basicCharShift('a', 'a', 26);
    }

    @Test
    void checkIfALoopsBackToAWhenKeyIsMinus26() {
        basicCharShift('A', 'A', -26);
    }

    @Test
    void checkIfSpaceCharacterDoesNotChange() {
        basicCharShift(' ', ' ', 1);
    }

    @Test
    void checkIfNonLetterCharDoesNotChange() {
        basicCharShift('&', '&', 10);
    }
}