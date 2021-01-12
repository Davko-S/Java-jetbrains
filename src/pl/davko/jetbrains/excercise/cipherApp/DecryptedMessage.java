package pl.davko.jetbrains.excercise.cipherApp;

public class DecryptedMessage extends Message {
    
    public DecryptedMessage(String data, String inFile, String outFile, String alg, boolean isOut, int key) {
        super(data, inFile, outFile, alg, isOut, key);
    }
}
