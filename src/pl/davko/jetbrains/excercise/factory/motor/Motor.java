package pl.davko.jetbrains.excercise.factory.motor;

public class Motor {

    public String model;
    public long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public long getPower() {
        return power;
    }
}
