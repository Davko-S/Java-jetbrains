package pl.davko.jetbrains.excercise.cipherApp.algorithm;

import org.junit.jupiter.api.Test;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.shift.ShiftEncryption;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode.UnicodeEncryption;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptionTest {

    void testOfInvokingShiftEncryption(String data, String expectedResult, int key) {
        Encryption shiftEncryption = new ShiftEncryption();
        String decryptedString = shiftEncryption.invoke(data, key);
        assertEquals(expectedResult, decryptedString);
    }

    void testOfInvokingUnicodeEncryption(String data, String expectedResult, int key) {
        Encryption unicodeEncryption = new UnicodeEncryption();
        String decryptedString = unicodeEncryption.invoke(data, key);
        assertEquals(expectedResult, decryptedString);
    }

    @Test
    void checkIfShiftDecryptionIsInvokedWithNegativeKey() {
        testOfInvokingShiftEncryption("bb bb", "aa aa", -1);
    }

    @Test
    void checkIfShiftDecryptionIsInvokedWithPositiveKey() {
        testOfInvokingShiftEncryption("zz zz ZZ", "aa aa AA", 1);
    }

    @Test
    void checkIfUnicodeDecryptionIsInvokedWithNegativeKey() {
        testOfInvokingUnicodeEncryption("bb\"bb", "`` ``", -2);
    }

    @Test
    void checkIfUnicodeDecryptionIsInvokedWithPositiveKey() {
        testOfInvokingUnicodeEncryption("`` ``", "bb\"bb", 2);
    }
}