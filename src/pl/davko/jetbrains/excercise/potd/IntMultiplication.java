package pl.davko.jetbrains.excercise.potd;

public class IntMultiplication {

    public static void multiply(int a, int b) {
        long product = 1;
        for (int i = a; i < b; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}
