package estudos.arrays;

public class Search {
    public static void main(String[] args) {

        // arrays
        int[] numbers = {1, 3, 5, 4, 7, 12, 44};
        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};

        // targets
        String fruitTarget = "Orange";
        int numberTarget = 7;

        // checkers
        boolean isNumberFound = false;
        boolean isFruitFound = false;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberTarget) {
                System.out.printf("FOUND NUMBER %d AT INDEX: %d\n", numberTarget, i);
                isNumberFound = true;
                break;
            }
        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(fruitTarget)) {
                System.out.printf("FOUND %s FRUIT AT INDEX: %d\n", fruitTarget, i);
                isFruitFound = true;
                break;
            }
        }

        if (!isNumberFound) {
            System.out.println("Element not found in the number array");
        }

        if (!isFruitFound) {
            System.out.println("Element not found in the fruits array");
        }
    }
}
