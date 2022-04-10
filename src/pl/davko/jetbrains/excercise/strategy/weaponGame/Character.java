package pl.davko.jetbrains.excercise.strategy.weaponGame;

public abstract class Character {
    WeaponBehaviour weapon;

    public void fight() {
        weapon.useWeapon();
    }
}
