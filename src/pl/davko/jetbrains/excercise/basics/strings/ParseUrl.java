package pl.davko.jetbrains.excercise.basics.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ParseUrl {

    public static void parseHtml() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] half = input.split("\\?");
        String[] tokens = half[1].split("&");

        for (String token : tokens) {
            String[] parameter = token.split("=");
            try {
                System.out.println(parameter[0] + " : " + parameter[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(parameter[0] + " : " + "not found");
            }
        }
        for (String token : tokens) {
            if (token.contains("pass")) {
                String[] password = token.split("=");
                System.out.println("password : " + password[1]);
            }
        }
    }

    public static void countWords() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
