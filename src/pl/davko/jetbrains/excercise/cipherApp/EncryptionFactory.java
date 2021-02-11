package pl.davko.jetbrains.excercise.cipherApp;

public class EncryptionFactory {

    Encryption make(AlgorithmType algorithmType) {
        switch (algorithmType) {
            case SHIFT: return new ShiftEncryption();
            case UNICODE: return new UnicodeEncryption();
            default: return null;
        }
    }
}
