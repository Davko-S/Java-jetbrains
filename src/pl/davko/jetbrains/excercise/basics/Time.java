package pl.davko.jetbrains.excercise.basics;

public class Time {


    public int hour;
    public int minute;
    public int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time noon() {
        return new Time(12, 0, 0);
    }

    public static Time midnight() {
        return new Time(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        int h = (int) Math.floor(seconds / 3600.0 % 24);
        int m = (int) Math.floor(seconds % 3600.0 / 60);
        int s = (int) (seconds % 3600.0 % 60);

        return new Time(h, m, s);
    }

    public static Time of(int hour, int minute, int second) {
        if (hour <= 23 && hour > 0 && minute > 0 && minute <= 59 && second > 0 && second <= 59) {
            int h = hour % 24;
            int m = minute % 60;
            int s = second % 60;
            return new Time(h, m, s);
        } else {
            return null;
        }
    }
}
