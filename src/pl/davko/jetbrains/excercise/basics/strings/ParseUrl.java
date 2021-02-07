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

        String[] first = cutTwo[0].split("=");
        if (first[0].contains("pass")) {
            pass = first[1];
            password = pass;
        } else {
            port = first[1];
        }
        System.out.println("pass: " + pass);
        System.out.println("password: " + password);
        System.out.println("port: " + port);
    }
}
