package pl.davko.jetbrains.excercise.sololearn;

public class Gamer {
    Gamer(Enums.Difficulty diff) {
        switch (diff) {
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;
            default:
                break;
        }
    }
}
