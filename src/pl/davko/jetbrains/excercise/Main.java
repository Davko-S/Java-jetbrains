package pl.davko.jetbrains.excercise;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import pl.davko.jetbrains.excercise.*;
import pl.davko.jetbrains.excercise.baseentity.*;
import pl.davko.jetbrains.excercise.geometry.*;
import pl.davko.jetbrains.excercise.problems.Game;
import pl.davko.jetbrains.excercise.strategy.*;
import pl.davko.jetbrains.excercise.factory.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int army = scanner.nextInt();

        System.out.println(Game.countSoldiers(army));
    }
}

