package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.Encryption;

public class ShiftEncryption extends Encryption {

    private final ShiftAlgorithm shiftAlgorithm = new ShiftAlgorithm();

    @Override
    public String encrypt(String data, int key) {
        return shiftAlgorithm.runAlgorithm(data, key);
    }
}
