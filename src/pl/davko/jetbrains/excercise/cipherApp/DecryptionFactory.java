package pl.davko.jetbrains.excercise.cipherApp;

public class DecryptionFactory {

    Decryption make(AlgorithmType algorithmType) {

        switch (algorithmType) {
            case SHIFT: return new ShiftDecryption();
            case UNICODE: return new UnicodeDecryption();
            default: return null;
        }
    }
}
