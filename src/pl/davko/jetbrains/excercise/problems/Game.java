package pl.davko.jetbrains.excercise.problems;

public class Game {

    public static String countSoldiers(int army) {
        if (army <= 0) {
            return "no army";
        } else if (army < 20) {
            return "pack";
        } else if (army < 249) {
            return "throng";
        } else if (army < 1000) {
            return "zounds";
        } else {
            return "legion";
        }
    }
}
