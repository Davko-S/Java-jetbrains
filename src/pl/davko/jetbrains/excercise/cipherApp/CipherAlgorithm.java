package pl.davko.jetbrains.excercise.cipherApp;

public abstract class CipherAlgorithm {

    public String runAlgorithm(String data, int key) {
        char[] dataToChar = data.toCharArray();
        for (int i = 0; i < dataToChar.length; i++) {
            dataToChar[i] = changeChar(dataToChar[i], key);
        }
        return new String(dataToChar);
    }

    protected abstract char changeChar(char data, int key);

}
