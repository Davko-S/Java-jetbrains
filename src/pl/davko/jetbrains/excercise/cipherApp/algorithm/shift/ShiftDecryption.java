package pl.davko.jetbrains.excercise.cipherApp.algorithm.shift;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.Decryption;

public class ShiftDecryption extends Decryption {

    private final ShiftAlgorithm shiftAlgorithm = new ShiftAlgorithm();

    @Override
    public String decrypt(String data, int key) {
        return shiftAlgorithm.runAlgorithm(data, 26 - (key % 26));
    }
}
