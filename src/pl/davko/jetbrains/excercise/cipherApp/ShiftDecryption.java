package pl.davko.jetbrains.excercise.cipherApp;

public class ShiftDecryption extends Decryption {

    private final ShiftAlgorithm shiftAlgorithm = new ShiftAlgorithm();

    @Override
    String decrypt(String data, int key) {
        return shiftAlgorithm.runAlgorithm(data, 26 - (key % 26));
    }
}
