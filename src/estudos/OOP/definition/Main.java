package estudos.OOP.definition;

public class Main {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();

        System.out.println("make: " + car.make);
        System.out.println("model: " + car.model);
        System.out.println("year: " + car.year);
        System.out.println("price: " + car.price);
        System.out.println("is running?: " + car.isRunning);

        car.start();
        car.drive();
        car.brake();
        car.stop();


    }
}
