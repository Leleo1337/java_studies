package estudos.OOP.composition;

public class Main {
    public static void main(String[] args) {

        // Composition = Represents a "part-off" relationship between objects.
        //               For example, an engine is "part of" a car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2025, "v8");

        car.start();

    }
}
