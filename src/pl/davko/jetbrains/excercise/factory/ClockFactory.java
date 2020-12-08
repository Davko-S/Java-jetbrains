package pl.davko.jetbrains.excercise.factory;

public class ClockFactory {

    private final boolean produceToyClock;

    public ClockFactory(boolean produceToyClock) {
        this.produceToyClock = produceToyClock;
    }

    public Clock produce(String type) {
        switch (type) {
            case "SAND":
                return new SandClock();
            case "MECH":
                return new MechanicalClock();
            case "DIGITAL":
                return new DigitalClock();
            default:
                return null;
        }
    }
}
