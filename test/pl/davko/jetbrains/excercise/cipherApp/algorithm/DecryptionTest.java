package pl.davko.jetbrains.excercise.cipherApp.algorithm;

import org.junit.jupiter.api.Test;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.shift.ShiftDecryption;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode.UnicodeDecryption;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecryptionTest {

    void testOfInvokingShiftDecryption(String data, String expectedResult, int key) {
        Decryption decryption = new ShiftDecryption();
        String decryptedString = decryption.invoke(data, key);
        assertEquals(expectedResult, decryptedString);
    }

    void testOfInvokingUnicodeDecryption(String data, String expectedResult, int key) {
        Decryption decryption = new UnicodeDecryption();
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

    @Test
    void checkIfUnicodeDecryptionIsInvokedWithNegativeKey() {
        testOfInvokingUnicodeDecryption("zz ZZ", "{{![[", -1);
    }

    @Test
    void checkIfUnicodeDecryptionIsInvokedWithPositiveKey() {
        testOfInvokingUnicodeDecryption("{{![[", "zz ZZ", 1);
    }
}