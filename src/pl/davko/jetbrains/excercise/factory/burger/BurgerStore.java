package pl.davko.jetbrains.excercise.factory.burger;

public class BurgerStore extends BurgerFactory {

    @Override
    Burger createBurger(String type) {
        switch (type) {
            case "american":
               return new AmericanBurger("American Burger");
            case "chinese":
                return new ChineseBurger("Chinese Burger");
            case "russian":
                return new RussianBurger("Russian Burger");
            default:
                return null;
        }
    }
}
