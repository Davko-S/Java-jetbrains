package pl.davko.jetbrains.excercise.sololearn;

public class Engine {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.play();
        cat.swim();
        dog.play();
        dog.swim();

    }
}
    //implementing two IE
    abstract class Animal implements Player, Swimmer {
        @Override
        public void play() {
        }

        @Override
        public void swim() {
        }
    }

    class Dog extends Animal {
        @Override
        public void play() {
            System.out.println("Dog is playing");
        }

        @Override
        public void swim() {
            System.out.println("Dog is swimming");
        }
    }

    class Cat extends Animal {
        @Override
        public void play() {
            System.out.println("Cat is playing");
        }

        @Override
        public void swim() {
            System.out.println("Cat is swimming");
        }
    }
