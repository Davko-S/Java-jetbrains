package pl.davko.jetbrains.excercise.factory;

public class ToyClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...tick...");
    }
}
