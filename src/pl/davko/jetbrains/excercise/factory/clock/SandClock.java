package pl.davko.jetbrains.excercise.factory.clock;

public class SandClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...sand noise...");
    }
}
