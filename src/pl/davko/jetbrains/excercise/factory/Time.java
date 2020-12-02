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


//    public static Time midnight() {
    // write your code here
//    }

//    public static Time ofSeconds(long seconds) {
        // write your code here
//    }

//    public static Time of(int hour, int minute, int second) {
        // write your code here
//    }
}
