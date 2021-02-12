package pl.davko.jetbrains.excercise.cipherApp;

public class UnicodeEncryption extends Encryption {

    private final UnicodeAlgorithm unicodeAlgorithm = new UnicodeAlgorithm();

    @Override
    String encrypt(String data, int key) {
        return unicodeAlgorithm.runAlgorithm(data, key);
    }
}
