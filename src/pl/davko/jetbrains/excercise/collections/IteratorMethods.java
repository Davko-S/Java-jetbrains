package pl.davko.jetbrains.excercise.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
The Iterator class provides the following methods:
hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
next(): Returns the next object and advances the iterator.
remove(): Removes the last object that was returned by next from the collection.
 */

public class IteratorMethods {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();
        it.next();
        it.next();
        it.next();
        System.out.println(it.next());

        //CodeCoach
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        Iterator<Integer> iter = nums.iterator();

        int sum = 0;
        while(iter.hasNext()) {
            sum += iter.next();
        }

        System.out.println(sum);
    }
}
