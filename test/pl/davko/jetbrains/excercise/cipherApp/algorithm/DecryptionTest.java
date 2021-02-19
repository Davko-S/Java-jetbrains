package pl.davko.jetbrains.excercise.cipherApp.algorithm;

import org.junit.jupiter.api.Test;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.shift.ShiftDecryption;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecryptionTest {

    void testOfInvokingDecryption(String data, String expectedResult, int key) {
        Decryption decryption = new ShiftDecryption();
        String decryptedString = decryption.invoke(data, key);
        assertEquals(expectedResult, decryptedString);
    }

    @Test
    void checkIfShiftDecryptionIsInvokedWithNegativeKey() {
        testOfInvokingDecryption("aa aa", "bb bb", -1);
    }

    @Test
    void checkIfShiftDecryptionIsInvokedWithPositiveKey() {
        testOfInvokingDecryption("aa aa AA", "zz zz ZZ", 1);
    }
}