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


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }

    }

    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        if (operation.equals(Operation.DEPOSIT)) {
            account.setBalance(account.getBalance() + sum);
            return true;
        } else if (operation.equals(Operation.WITHDRAW)) {
            if (sum > account.getBalance()) {
                System.out.println("Not enough money to withdraw.");
                return false;
            } else {
                account.setBalance(account.getBalance() - sum);
                return true;
            }
        }
        return false;
    }
}

