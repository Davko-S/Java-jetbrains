package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnicodeEncryptionTest {

    private void basicTestForUnicodeEncryption(String data, String expectedResult, int key) {
        UnicodeEncryption encryption = new UnicodeEncryption();
        String encryptedResult = encryption.encrypt(data, key);
        assertEquals(expectedResult, encryptedResult);
    }

    @Test
    void checkIfEmptyStringRemainsUnchanged() {
        basicTestForUnicodeEncryption("", "", 15);
    }

    @Test
    void checkEncryptionWhenKeyIs0() {
        basicTestForUnicodeEncryption("Testing testing", "Testing testing", 0);
    }

    @Test
    void checkIfAtSymbolChangesToA() {
        basicTestForUnicodeEncryption("@@@", "AAA", 1);
    }

    @Test
    void checkIfWhiteSpacesAreEncrypted() {
        basicTestForUnicodeEncryption(" ", "4", 20);
    }

    @Test
    void checkIfTextIsEncryptedWithNegativeKey() {
        basicTestForUnicodeEncryption("dupa", "cto`", -1);
    }

    @Test
    void checkIfTextIsEncryptedWithPositiveKey() {
        basicTestForUnicodeEncryption("cto`", "dupa", 1);
    }

    @Test
    void checkIfNonLetterCharsAreEncrypted() {
        basicTestForUnicodeEncryption("!!##$$", "002233", 15);
    }

    @Test
    void checkWhenKeyIsOutOfASCIITable() {
        basicTestForUnicodeEncryption("žžž", "ȀȀȀ", 130);
    }
}