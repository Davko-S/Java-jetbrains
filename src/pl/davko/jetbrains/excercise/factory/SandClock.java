package pl.davko.jetbrains.excercise.factory;

public class SandClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...sand noise...");
    }
}
