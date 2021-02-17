package pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.CipherAlgorithm;

public class UnicodeAlgorithm extends CipherAlgorithm {

    @Override
    protected char changeChar(char data, int key) {
        return (char) (data + key);
    }

}
