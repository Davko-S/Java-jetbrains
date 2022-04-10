package pl.davko.jetbrains.excercise.factory.robot;

/** Product */
public abstract class Robot {

    public abstract String getName();
    public abstract String getDescription();
    public abstract int getPower();

    @Override
    public String toString() {
        return "robot: {\n\t" +
                "name : " + getName() + "\n\t" +
                "description : " + getDescription() + "\n\t" +
                "power : " + getPower() + "\n}";
    }
}
