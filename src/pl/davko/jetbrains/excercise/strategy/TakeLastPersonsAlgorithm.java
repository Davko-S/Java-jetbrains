package pl.davko.jetbrains.excercise.strategy;

import java.util.Arrays;

public class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {

    private final int count;

    public TakeLastPersonsAlgorithm(int count) {
        this.count = count;
    }

    @Override
    public Person[] select(Person[] persons) {
        if (count == 1) {
            return new Person[]{persons[persons.length - 1]};
        } else {
            return Arrays.copyOfRange(persons, persons.length - count, persons.length);
        }
    }
}
