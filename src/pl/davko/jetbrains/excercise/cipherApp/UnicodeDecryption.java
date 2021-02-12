package pl.davko.jetbrains.excercise.cipherApp;

public class UnicodeDecryption extends Decryption {

    private final UnicodeAlgorithm unicodeAlgorithm = new UnicodeAlgorithm();

    @Override
    String decrypt(String data, int key) {
        return unicodeAlgorithm.runAlgorithm(data, -1 * key);
    }
}
