package pl.davko.jetbrains.excercise.strategy.weaponGame;

public class Troll extends Character {

    @Override
    public void fight() {
        WeaponBehaviour weapon = new SwordBehaviour();
        System.out.println(weapon);
    }
}
