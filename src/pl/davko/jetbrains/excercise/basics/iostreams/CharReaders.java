package pl.davko.jetbrains.excercise.basics.iostreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharReaders {

    public static void inverseCharSequence() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = new char[50];
        int number = reader.read(chars);
        reader.close();
        for (int i = number - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
