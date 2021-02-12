package pl.davko.jetbrains.excercise.cipherApp;

public class ShiftEncryption extends Encryption {

    private final ShiftAlgorithm shiftAlgorithm = new ShiftAlgorithm();

    @Override
    String encrypt(String data, int key) {
        return shiftAlgorithm.runAlgorithm(data, key);
    }
}
