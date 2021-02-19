package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShiftDecryptionTest {

    private final ShiftDecryption shiftDecryption = new ShiftDecryption();

    private void basicTestForShiftDecryption(String data, String expectedResult, int key) {
        String decryptedResult = shiftDecryption.decrypt(data, key);
        assertEquals(expectedResult, decryptedResult);
    }

    @Test
    void checkIfEmptyStringRemainsUnchanged() {
        basicTestForShiftDecryption("", "", 15);
    }

    @Test
    void checkIfTextIsNotDecryptedWhenKeyIs0() {
        basicTestForShiftDecryption("Testing testing", "Testing testing", 0);
    }

    @Test
    void checkIfWhiteSpacesAreNotDecrypted() {
        basicTestForShiftDecryption(" ", " ", 20);
    }

    @Test
    void checkIfTextIsDecryptedWithNegativeKey() {
        basicTestForShiftDecryption("dupa", "evqb", -1);
    }

    @Test
    void checkIfTextIsDecryptedWithPositiveKey() {
        basicTestForShiftDecryption("evqb", "dupa", 1);
    }
}