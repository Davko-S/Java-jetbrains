package pl.davko.jetbrains.excercise.cipherApp;

public class ShiftAlgorithm extends CipherAlgorithm {

    @Override
    protected char changeChar(char c, int key) {
        if (c == ' ' || (int) c < 65) {
            return c;
        } else if ((int) c < 97) {
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
