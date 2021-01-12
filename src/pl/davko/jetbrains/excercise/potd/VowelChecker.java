package pl.davko.jetbrains.excercise.potd;

public class VowelChecker {

    public static boolean checkVowel(char ch) {
        char[] vowels = "aeiouAEIOU".toCharArray();
        for (char vowel : vowels) {
            if (vowel == ch) {
                return true;
            }
        }
        return false;
    }
}
