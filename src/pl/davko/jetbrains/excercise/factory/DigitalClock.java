package pl.davko.jetbrains.excercise.factory;

public class DigitalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}
