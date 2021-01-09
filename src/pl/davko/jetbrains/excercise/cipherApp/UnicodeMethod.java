package pl.davko.jetbrains.excercise.cipherApp;

public class UnicodeMethod extends Method {

    public static String encrypt(Message message) {
        char[] rawString = message.getData().toCharArray();
        for (int i = 0; i < rawString.length; i++) {
            rawString[i] = changeChar(rawString[i], message.getKey());
        }
        return new String(rawString);
    }

    public static String decrypt(Message message) {
        char[] rawString = message.getData().toCharArray();
        for (int i = 0; i < rawString.length; i++) {
            rawString[i] = changeChar(rawString[i], (-1) * message.getKey());
        }
        return new String(rawString);
    }

    public static char changeChar(char c, int key) {
        return (char) (c + key);
    }
}
