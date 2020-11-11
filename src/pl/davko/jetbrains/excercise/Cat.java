package pl.davko.jetbrains.excercise;

public class Cat {
    String name;
    int age;

    static int counter;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public Cat(String name) {
        this(name, 5);
    }

    public static int getNumberOfCats() {
        return counter;
    }
    public String getCatName() {
        return name;
    }
}
