package pl.davko.jetbrains.excercise.factory.clock;

import pl.davko.jetbrains.excercise.factory.clock.Clock;

public class ToyClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...tick...");
    }
}
