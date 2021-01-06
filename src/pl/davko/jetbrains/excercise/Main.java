package pl.davko.jetbrains.excercise;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

import pl.davko.jetbrains.excercise.factory.robot.Robot;
import pl.davko.jetbrains.excercise.factory.robot.RobotFactory;
import pl.davko.jetbrains.excercise.factory.robot.RobotType;
import pl.davko.jetbrains.excercise.potd.IntSequence;

public class Main {
    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();
        Scanner scanner = new Scanner(System.in);

        String nameCleaner = scanner.nextLine();

        Robot robotCleaner = robotFactory.
                getRobot(
                        RobotType.ROBOT_CLEANER,
                        nameCleaner,
                        "Robot will clean my room and dry my socks",
                        100);

        System.out.println(robotCleaner);

        scanner.close();

    }
}

