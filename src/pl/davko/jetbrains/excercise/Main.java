package pl.davko.jetbrains.excercise;

import pl.davko.jetbrains.excercise.factory.burger.BurgerStore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import static pl.davko.jetbrains.excercise.potd.MagicNumber.printStar;
import static pl.davko.jetbrains.excercise.potd.MagicNumber.printVoid;

public class Main {
    public static void main(String[] args) {

    }


    //Encryption method with added algorithm type as parameter
    public static String encryptString(String s, int key, String alg) {
        char[] ourString = s.toCharArray();
        if (alg.equals("unicode")) {
            for (int i = 0; i < ourString.length; i++) {
                ourString[i] = changeChar(ourString[i], key);
            }
        } else {
            //...implement shift algorithm

        }
        return new String(ourString);
    }

    //Decryption method with added algorithm type as parameter
    public static String decryptString(String s, int key, String alg) {
        char[] ourString = s.toCharArray();
        if (alg.equals("unicode")) {
            for (int i = 0; i < ourString.length; i++) {
                ourString[i] = changeChar(ourString[i], (-1) * key);
            }
        } else {
            //...implement shift algorithm
        }
        return new String(ourString);
    }

    public static char changeChar(char c, int key) {
        return (char)(c + key);
    }

}

