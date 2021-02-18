package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnicodeDecryptionTest {

    private void basicTestForUnicodeDecryption(String data, String expectedResult, int key) {
        UnicodeDecryption decryption = new UnicodeDecryption();
        String decryptedResult = decryption.decrypt(data, key);
        assertEquals(expectedResult, decryptedResult);
    }

    @Test
    void checkIfEmptyStringRemainsUnchanged() {
        basicTestForUnicodeDecryption("", "", 15);
    }

    @Test
    void checkDecryptionWhenKeyIs0() {
        basicTestForUnicodeDecryption("Testing testing", "Testing testing", 0);
    }

    @Test
    void checkIfCapitalAChangesToAtSymbol() {
        basicTestForUnicodeDecryption("AAA", "@@@", 1);
    }

    @Test
    void checkIfWhiteSpacesAreDecrypted() {
        basicTestForUnicodeDecryption(" ", "\f", 20);
    }

    @Test
    void checkIfTextIsDecryptedWithNegativeKey() {
        basicTestForUnicodeDecryption("dupa", "evqb", -1);
    }

    @Test
    void checkIfTextIsDecryptedWithPositiveKey() {
        basicTestForUnicodeDecryption("evqb", "dupa", 1);
    }

    @Test
    void checkIfNonLetterCharsAreDecrypted() {
        basicTestForUnicodeDecryption("{{||}}", "xxyyzz", 3);
    }
}