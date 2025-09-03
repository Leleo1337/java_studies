package estudos.randomNumbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        boolean isHeads;

        number = random.nextInt(1, 101);
        isHeads = random.nextBoolean();

        System.out.println(isHeads ? "Heads" : "Tails");
        System.out.println(number);
    }
}
