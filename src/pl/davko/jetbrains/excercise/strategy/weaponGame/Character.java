package pl.davko.jetbrains.excercise.strategy.weaponGame;

public class Character {
    WeaponBehaviour weapon;

    public void fight() {
        weapon.useWeapon();
    }
}
