package pl.davko.jetbrains.excercise.basics.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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

    public static void countWords() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int loopReps = 0;
        reader.close();

        String[] words = input.split("\\s+");
        for (String w : words) {
            loopReps++;
            if ("".equals(w)) {
                loopReps--;
            }
        }
        System.out.println(loopReps);
    }
}
