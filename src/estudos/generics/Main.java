package estudos.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>();
        Box<String> box = new Box<>();
        Product<String, Double> product1 = new Product<>("banana", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        fruits.add("apple");
        System.out.println(fruits);

        box.setItem("banana");
        System.out.println(box.getItem());

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.printf("The product is: %s | The price is: %.2f$\n", product1.item, product1.price);

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
        System.out.printf("The product is: %s | The price is: %d$\n", product2.item, product2.price);


    }

}
