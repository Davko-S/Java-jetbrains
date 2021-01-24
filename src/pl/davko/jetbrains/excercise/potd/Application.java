package pl.davko.jetbrains.excercise.potd;

public class Application {

    String name = "SimpleApplication";

    public void run(String[] args) {
        System.out.println(this.name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
