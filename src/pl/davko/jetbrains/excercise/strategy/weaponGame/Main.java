package pl.davko.jetbrains.excercise.strategy.weaponGame;

public class Main {
    public static void main(String[] args){
        Character troll = new Troll();
        Character queen = new Queen();
        troll.fight();
        queen.fight();
    }
}
