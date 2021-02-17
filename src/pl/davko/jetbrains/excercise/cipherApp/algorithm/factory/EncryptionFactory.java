package pl.davko.jetbrains.excercise.cipherApp.algorithm.factory;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.AlgorithmType;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.Encryption;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.shift.ShiftEncryption;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.unicode.UnicodeEncryption;

public class EncryptionFactory {

    Encryption make(AlgorithmType algorithmType) {
        switch (algorithmType) {
            case SHIFT: return new ShiftEncryption();
            case UNICODE: return new UnicodeEncryption();
            default: return null;
        }
    }
}
