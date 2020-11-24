package pl.davko.jetbrains.excercise;

public class Palindrome {

    public static boolean checkPalindrome(String palindrome) {
        boolean isP = true;
        for (int i = 1; i <= palindrome.length(); i++) {
            if (palindrome.charAt(i - 1) != palindrome.charAt(palindrome.length() - i)) {
                isP = false;
            }
        }
        System.out.println(isP);
        return isP;
    }
}
