package pl.davko.jetbrains.excercise.cipherApp;

public class ShiftMethod extends Method {

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
            rawString[i] = changeChar(rawString[i], 26 - (message.getKey() % 26));
        }
        return new String(rawString);
    }

    public static char changeChar(char c, int key) {
        if ((int) c < 97) {
            int originalPosition = c - 'A';
            int newPosition = (originalPosition + key) % 26;
            return (char) ('A' + newPosition);
        } else {
            int originalPosition = c - 'a';
            int newPosition = (originalPosition + key) % 26;
            return (char) ('a' + newPosition);
        }
    }
}
