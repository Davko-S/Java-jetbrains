package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftAlgorithmTest {

    private void basicCharShiftTest(char inputChar, char expectedChar, int key) {
        ShiftAlgorithm algorithm = new ShiftAlgorithm();
        char character = algorithm.changeChar(inputChar, key);
        assertEquals(expectedChar, character);
    }

    @Test
    void checkIfAChangesToBWhenKeyIs1() {
        basicCharShiftTest('a', 'b', 1);
    }

    @Test
    void checkIfBChangesToAWhenKeyIsMinus1() {
        basicCharShiftTest('b', 'a', -1);
    }

    @Test
    void checkIfADoesNotChangeIfKeyIs0() {
        basicCharShiftTest('A', 'A', 0);
    }

    @Test
    void checkIfALoopsBackToAWhenKeyIs26() {
        basicCharShiftTest('a', 'a', 26);
    }

    @Test
    void checkIfALoopsBackToAWhenKeyIsMinus26() {
        basicCharShiftTest('A', 'A', -26);
    }

    @Test
    void checkIfSpaceCharacterDoesNotChange() {
        basicCharShiftTest(' ', ' ', 1);
    }

    @Test
    void checkIfNonLetterCharDoesNotChange() {
        basicCharShiftTest('&', '&', 10);
    }
}