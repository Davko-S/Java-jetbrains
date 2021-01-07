package pl.davko.jetbrains.excercise;

import pl.davko.jetbrains.excercise.factory.burger.BurgerStore;

import static pl.davko.jetbrains.excercise.potd.MagicNumber.printStar;
import static pl.davko.jetbrains.excercise.potd.MagicNumber.printVoid;

public class Main {
    public static void main(String[] args) {

        printStar(8);
        System.out.println("");
        printVoid(6); printStar(2);
        System.out.println("");
        printVoid(6); printStar(2);
        System.out.println("");
        printVoid(6); printStar(2);
        System.out.println("");
        printStar(2); printVoid(4); printStar(2);
        System.out.println("");
        printStar(2); printVoid(4); printStar(2);
        System.out.println("");
        printVoid(1); printStar(7);
    }
}

