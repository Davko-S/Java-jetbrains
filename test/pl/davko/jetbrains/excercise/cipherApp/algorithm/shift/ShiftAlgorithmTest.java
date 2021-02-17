package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftAlgorithmTest {

    private void basicTest(char inputChar, char expectedChar,  int key) {
        ShiftAlgorithm algorithm = new ShiftAlgorithm();
        char character = algorithm.changeChar(inputChar, key);
        assertEquals(expectedChar, character);
    }

    @Test
    void checkIfAChangesToBWhenKeyIs1() {
        basicTest('a', 'b', 1);
    }

    @Test
    void checkIfBChangesToAWhenKeyIsMinus1() {
        basicTest('b', 'a', -1);
    }

}