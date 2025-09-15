package estudos.arrays;

public class JavaArrays {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banaana", "coconut", "orange"};

        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        // java array utils
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");


        System.out.println("There is " + numOfFruits + " fruits in your array");
        System.out.println("the index 0 is: " + fruits[0]);

        // lists all fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
