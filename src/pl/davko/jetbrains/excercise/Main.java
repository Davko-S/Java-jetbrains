package pl.davko.jetbrains.excercise;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import pl.davko.jetbrains.excercise.*;


public class Main {
    public static void main(String[] args) {
        Announcement anons = new Announcement("Will sell a house", 30);
        System.out.println(anons.getInfo());


        ChargeLevel high = ChargeLevel.HIGH;
        ChargeLevel low = ChargeLevel.LOW;
        System.out.println(low.name());
    }
}

