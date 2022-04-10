package pl.davko.jetbrains.excercise.factory.clock;

public class DigitalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}
