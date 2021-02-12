package pl.davko.jetbrains.excercise.cipherApp;

public class CipherActionFactory {

    private final EncryptionFactory encryptionFactory = new EncryptionFactory();
    private final DecryptionFactory decryptionFactory = new DecryptionFactory();

    CipherAction make(ActionType actionType, AlgorithmType algorithmType) {

        switch (actionType) {
            case ENCRYPT:
                return encryptionFactory.make(algorithmType);
            case DECRYPT:
                return decryptionFactory.make(algorithmType);
            default:
                return null;
        }
    }
}
