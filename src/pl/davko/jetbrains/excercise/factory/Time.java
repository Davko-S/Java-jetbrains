package pl.davko.jetbrains.excercise.factory;

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
        return new Time(12, 0, 0 );
    }

    public static Time midnight() {
        return new Time(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        int h = (int) Math.floor(seconds / 3600.0 % 24);
        int m = (int) Math.floor(seconds % 3600.0 / 60);
        int s = (int) (((int)seconds % 3600.0 / 60 - m) * 60);
        System.out.println(s);

        return new Time(h, m, s);
    }

//    public static Time of(int hour, int minute, int second) {
//
//    }
}
