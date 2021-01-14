package pl.davko.jetbrains.excercise.strategy.weaponGame;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Slicing with knife!");
    }
}
