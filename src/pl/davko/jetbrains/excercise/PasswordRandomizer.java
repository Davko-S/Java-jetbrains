package pl.davko.jetbrains.excercise;

import java.util.Random;
import java.util.Scanner;

public class PasswordRandomizer {

    public static String randomBigLetter(int len) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder big = new StringBuilder();
        char firstChar = 'A';

        for (int i = 0; i < len; i++) {
            int randIx = new Random().nextInt(alphabet.length());
            char randChar = alphabet.charAt(randIx);
            if (randChar == firstChar) {
                randChar = alphabet.charAt(randIx + 1);
            }
            firstChar = randChar;
            big.append(randChar);
        }
        return big.toString();
    }

    public static String randomNumber(int len) {

        String numbers = "0123456789";
        StringBuilder num = new StringBuilder();
        char firstNum = '0';

        for (int i = 0; i < len; i++) {
            int randIx = new Random().nextInt(numbers.length());
            char randChar = numbers.charAt(randIx);
            if (randChar == firstNum) {
                randChar = numbers.charAt(randIx + 1);
            }
            firstNum = randChar;
            num.append(randChar);
        }
        return num.toString();
    }

    public static void makePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many big letters?");
        int noOfLetters = sc.nextInt();
        System.out.println("How many numbers?");
        int noOfNums = sc.nextInt();
        System.out.println(randomBigLetter(noOfLetters) + randomNumber(noOfNums));
    }
}
