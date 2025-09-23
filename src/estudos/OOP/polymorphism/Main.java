package estudos.OOP.polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can indentify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        car.go();
        bike.go();
        boat.go();

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
