package pl.davko.jetbrains.excercise.factory;

public class MechanicalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...clang mechanism...");
    }
}
