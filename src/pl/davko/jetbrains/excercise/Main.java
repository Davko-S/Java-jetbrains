package pl.davko.jetbrains.excercise;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Downloading all necessary data...");
        for (int i = 0; i < 100; i++) {
            System.out.print("Progress: " + i + " %\r");
            Thread.sleep(50);
        }
        System.out.println("Done.");
    }
}

