package pl.davko.jetbrains.excercise.strategy;

public class MinFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MAX_VALUE;
        } else {
            int min = numbers[0];
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }
    }
}
