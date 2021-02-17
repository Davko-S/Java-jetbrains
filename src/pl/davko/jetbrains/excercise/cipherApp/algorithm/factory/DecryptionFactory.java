package pl.davko.jetbrains.excercise.cipherApp.algorithm.factory;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.AlgorithmType;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.Decryption;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.shift.ShiftDecryption;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode.UnicodeDecryption;

public class DecryptionFactory {

    Decryption make(AlgorithmType algorithmType) {

        switch (algorithmType) {
            case SHIFT:
                return new ShiftDecryption();
            case UNICODE:
                return new UnicodeDecryption();
            default:
                return null;
        }
    }
}
