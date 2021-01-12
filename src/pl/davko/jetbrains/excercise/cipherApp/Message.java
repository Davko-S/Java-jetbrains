package pl.davko.jetbrains.excercise.cipherApp;

public class Message {

    String data;
    String inFile;
    String outFile;
    String alg;
    boolean isOut;
    int key;

    public Message(String data, String inFile, String outFile, String alg, boolean isOut, int key) {
        this.data = data;
        this.inFile = inFile;
        this.outFile = outFile;
        this.alg = alg;
        this.isOut = isOut;
        this.key = key;
    }

    public String getInFile() {
        return inFile;
    }

    public void setInFile(String inFile) {
        this.inFile = inFile;
    }

    public String getOutFile() {
        return outFile;
    }

    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean out) {
        isOut = out;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
