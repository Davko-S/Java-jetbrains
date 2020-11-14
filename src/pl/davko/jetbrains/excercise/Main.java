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
        Notification notif = new Notification("No problems");

        Notification warn = new Warning("Money ends");

        Notification alarm = new Alarm("The ship sank");

        System.out.println("warn.getMsg");
        warn.show();
        System.out.println("alarm.show");
        alarm.show();
        System.out.println("warn.show");
        warn.show();
        System.out.println("notif.show");
        notif.show();
        System.out.println("alarm.getMsg");
        alarm.getMsg();
    }
}

