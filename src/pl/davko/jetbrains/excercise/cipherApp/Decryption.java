package pl.davko.jetbrains.excercise.cipherApp;

public abstract class Decryption implements CipherAction {
    abstract String decrypt(String data, int key);

    @Override
    public String invoke(String data, int key) {
        return decrypt(data, key);
    }
}
