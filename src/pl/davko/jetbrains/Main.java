package pl.davko.jetbrains;

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
        Employee employee = new Employee("John", "john@email.com", 5);
        System.out.println(employee.getEmail());
    }
}

