package pl.davko.jetbrains.excercise.cipherApp;

public class UnicodeAlgorithm extends CipherAlgorithm {

    @Override
    protected char changeChar(char data, int key) {
        return (char) (data + key);
    }

}
