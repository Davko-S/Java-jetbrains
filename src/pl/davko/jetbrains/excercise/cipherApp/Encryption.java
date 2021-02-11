package pl.davko.jetbrains.excercise.cipherApp;

public abstract class Encryption implements CipherAction {
    abstract String encrypt(String data, int key);

    @Override
    public String invoke(String data, int key) {
        return encrypt(data, key);
    }
}
