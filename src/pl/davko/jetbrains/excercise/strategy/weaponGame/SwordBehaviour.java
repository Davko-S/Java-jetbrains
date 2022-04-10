package pl.davko.jetbrains.excercise.strategy.weaponGame;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword!");
    }
}
