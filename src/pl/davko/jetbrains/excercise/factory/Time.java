package pl.davko.jetbrains.excercise.factory;

class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public static Time noon(int hour, int minute, int second) {
        return new Time(hour = 12, minute = 0, second = 0);
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
