package pl.davko.jetbrains.excercise;
import pl.davko.jetbrains.excercise.strategy.weaponGame.*;
import pl.davko.jetbrains.excercise.strategy.weaponGame.Character;

public class Main {
    public static void main(String[] args) {

        Character troll = new Troll();
        troll.fight();

        Character queen = new Queen();
        queen.fight();
    }
}

