package pl.davko.jetbrains.excercise.basics.exceptions;

public class IllegalArgument {

    public static String getDayOfTheWeek(int number) {
        switch (number) {
            case 1: return "Mon";
            case 2: return "Tue";
            case 3: return "Wed";
            case 4: return "Thu";
            case 5: return "Fri";
            case 6: return "Sat";
            case 7: return "Sun";
            default: throw new IllegalArgumentException("Wrong number of day!");
        }
    }
}
