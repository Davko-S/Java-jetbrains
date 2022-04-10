package pl.davko.jetbrains.excercise.cipherApp.algorithm.factory;

import pl.davko.jetbrains.excercise.cipherApp.algorithm.ActionType;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.AlgorithmType;
import pl.davko.jetbrains.excercise.cipherApp.algorithm.CipherAction;

public class CipherActionFactory {

    private final EncryptionFactory encryptionFactory = new EncryptionFactory();
    private final DecryptionFactory decryptionFactory = new DecryptionFactory();

    public CipherAction make(ActionType actionType, AlgorithmType algorithmType) {

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
