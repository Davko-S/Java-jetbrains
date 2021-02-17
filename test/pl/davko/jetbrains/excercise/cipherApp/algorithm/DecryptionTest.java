package pl.davko.jetbrains.excercise.cipherApp.algorithm;

import org.junit.jupiter.api.Test;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.shift.ShiftDecryption;

import static org.junit.jupiter.api.Assertions.*;

class DecryptionTest {

    void testOfInvokingShiftDecryption(String data, String expectedResult, int key) {
        Decryption decryption = new ShiftDecryption();
        String decryptedString = decryption.invoke(data, key);
        assertEquals(expectedResult, decryptedString);
    }

    @Test
    void checkIfShiftDecryptionIsInvokedWithNegativeKey() {
        testOfInvokingShiftDecryption("aa aa", "bb bb", -1);
    }

    @Test
    void checkIfShiftDecryptionIsInvokedWithPositiveKey() {
        testOfInvokingShiftDecryption("aa aa AA", "zz zz ZZ", 1);
    }
}