package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.Encryption;

public class UnicodeEncryption extends Encryption {

    private final UnicodeAlgorithm unicodeAlgorithm = new UnicodeAlgorithm();

    @Override
    public String encrypt(String data, int key) {
        return unicodeAlgorithm.runAlgorithm(data, key);
    }
}
