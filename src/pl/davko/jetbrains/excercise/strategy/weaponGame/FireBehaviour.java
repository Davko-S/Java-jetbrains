package pl.davko.jetbrains.excercise.strategy.weaponGame;

public class FireBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("Killing with fire!");
    }
}
