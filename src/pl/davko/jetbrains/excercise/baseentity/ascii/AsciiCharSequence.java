package pl.davko.jetbrains.excercise.baseentity.ascii;

import java.util.*;

public class AsciiCharSequence implements java.lang.CharSequence {

    byte[] ascii;


    public AsciiCharSequence(byte[] ascii) {
        this.ascii = ascii.clone();
    }


    @Override
    public int length() {
        return ascii.length;
    }

    @Override
    public char charAt(int index) {
        return (char) ascii[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(ascii, start, end));
    }

    @Override
    public String toString() {
        return new String(ascii.clone());
    }
}
