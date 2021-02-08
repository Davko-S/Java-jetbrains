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
        String name = "";
        String cookie = "";
        String host = "";
        String password = "";

        String[] first = cutTwo[0].split("=");
        if (first[0].contains("pass")) {
            pass = first[1];
            password = pass;
            try {
                String[] portArray = cutTwo[1].split("=");
                port = portArray[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                port = "not found";
            }
            try {
                String[] cookieArray = cutTwo[2].split("=");
                if (cookieArray[0].equals("cookie")) {
                    cookie = cookieArray[1];
                } else if (cookieArray[0].equals("name")) {
                    name = cookieArray[1];
                }

            } catch (ArrayIndexOutOfBoundsException f) {
                cookie = "not found";
            }
            try {
                String[] hostArray = cutTwo[3].split("=");
                host = hostArray[1];
            } catch (ArrayIndexOutOfBoundsException g) {
                host = "not found";
            }
        } else {
            try {
                String[] portArray = cutTwo[0].split("=");
                port = portArray[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                port = "not found";
            }
            try {
                String[] cookieArray = cutTwo[1].split("=");
                cookie = cookieArray[1];
            } catch (ArrayIndexOutOfBoundsException f) {
                cookie = "not found";
            }
            try {
                String[] hostArray = cutTwo[2].split("=");
                host = hostArray[1];
            } catch (ArrayIndexOutOfBoundsException g) {
                host = "not found";
            }
        }
        if (!pass.equals("")) {
            System.out.println("pass : " + pass);
        }
        System.out.println("port : " + port);
        if (!name.equals("")) {
            System.out.println("name : " + name);
        }
        System.out.println("cookie : " + cookie);
        System.out.println("host : " + host);
        if (!password.equals("")) {
            System.out.println("password : " + password);
        }
    }
}
