package pl.davko.jetbrains.excercise.basics.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ParseUrl {

    public static void parseHtml() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] cutOne = input.split("\\?");

        String[] cutTwo = cutOne[1].split("&");
        String pass = "";
        String port = "";
        String cookie = "";
        String host = "";
        String password = "";

        String[] first = cutTwo[0].split("pass=");
        if (first[0].equals("") && first[1].equals("")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
