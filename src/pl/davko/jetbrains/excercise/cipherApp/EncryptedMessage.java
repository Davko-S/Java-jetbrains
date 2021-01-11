package pl.davko.jetbrains.excercise.cipherApp;

public class EncryptedMessage extends Message {

    public EncryptedMessage(String data, String inFile, String outFile, String alg, boolean isOut, int key) {
        super(data, inFile, outFile, alg, isOut, key);
    }
}
