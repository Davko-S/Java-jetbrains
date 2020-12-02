package pl.davko.jetbrains.excercise.factory;

import java.util.Locale;

public class MotorStaticFactory {

    public static Motor make(char type, String model, long power) {
        switch (String.valueOf(type).toLowerCase()) {
            case "e":
                return new ElectricMotor(model, power);
            case "p":
                return new PneumaticMotor(model, power);
            case "h":
                return new HydraulicMotor(model, power);
            case "w":
                return new WarpDrive(model, power);
            default:
                return null;

        }
    }
}