package pl.davko.jetbrains.excercise.factory.robot;

public class RobotFactory {

    /** Factory Method **/
    public Robot getRobot(RobotType type, String name, String description, int power) {
        return new RobotCleaner(name, description, power);
    }
}
