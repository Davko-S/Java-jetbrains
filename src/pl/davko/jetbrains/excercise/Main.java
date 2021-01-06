package pl.davko.jetbrains.excercise;

import pl.davko.jetbrains.excercise.factory.burger.BurgerStore;

public class Main {
    public static void main(String[] args) {

        BurgerStore burgerStore = new BurgerStore();
        try {
            burgerStore.orderBurger("chinese");
            burgerStore.orderBurger("american");
            burgerStore.orderBurger("russian");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

