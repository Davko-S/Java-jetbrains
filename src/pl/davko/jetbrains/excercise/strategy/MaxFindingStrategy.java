package pl.davko.jetbrains.excercise.strategy;

public class MaxFindingStrategy implements FindingStrategy {

    public int getResult(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
    }
}
