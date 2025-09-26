package estudos.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");

        //fruits.remove(0);
        //fruits.set(1, "Pineapple");

        //System.out.println(fruits.get(2));
        //System.out.println(fruits.size());

        //Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);
    }
}
