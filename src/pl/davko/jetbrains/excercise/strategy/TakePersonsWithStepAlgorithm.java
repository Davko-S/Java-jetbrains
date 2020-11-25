package pl.davko.jetbrains.excercise.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {

    private final int step;

    public TakePersonsWithStepAlgorithm(int step) {
        this.step = step;
    }

    @Override
    public Person[] select(Person[] persons) {
        if (step == 1) {
            return persons;
        } else {
            List<Person> newPersons = new ArrayList<>();
            for (int i = 0; i < persons.length; i += step) {
                newPersons.add(persons[i]);
            }
            return newPersons.toArray(new Person[0]);
        }
    }
}
