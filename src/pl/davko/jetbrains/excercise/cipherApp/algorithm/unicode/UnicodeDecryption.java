package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.Decryption;

public class UnicodeDecryption extends Decryption {

    private final UnicodeAlgorithm unicodeAlgorithm = new UnicodeAlgorithm();

    @Override
    public String decrypt(String data, int key) {
        return unicodeAlgorithm.runAlgorithm(data, -1 * key);
    }
}
