package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShiftEncryptionTest {

    private final ShiftEncryption shiftEncryption = new ShiftEncryption();

    private void basicTestForShiftEncryption(String data, String expectedResult, int key) {
        String encryptedResult = shiftEncryption.encrypt(data, key);
        assertEquals(expectedResult, encryptedResult);
    }

    @Test
    void checkIfEmptyStringRemainsUnchanged() {
        basicTestForShiftEncryption("", "", 15);
    }

    @Test
    void checkIfTextIsNotEncryptedWhenKeyIs0() {
        basicTestForShiftEncryption("Testing testing", "Testing testing", 0);
    }

    @Test
    void checkIfWhiteSpacesAreNotEncrypted() {
        basicTestForShiftEncryption(" ", " ", 20);
    }

    @Test
    void checkIfTextIsEncryptedWithNegativeKey() {
        basicTestForShiftEncryption("evqb", "dupa", -1);
    }

    @Test
    void checkIfTextIsEncryptedWithPositiveKey() {
        basicTestForShiftEncryption("dupa", "evqb", 1);
    }
}