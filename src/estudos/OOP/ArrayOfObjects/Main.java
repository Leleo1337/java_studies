package estudos.OOP.ArrayOfObjects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Green");
        Car car3 = new Car("Charger", "Blue");

        Car[] cars1 = {car1, car2, car3};
        Car[] cars2 = {
                new Car("Mustang", "Red"),
                new Car("Corvette", "Green"),
                new Car("Charger", "Blue")
        };

        for (int i = 0; i < cars1.length; i++) {
            cars1[i].drive();
        }

        for (Car car : cars2) {
            car.color = "Black";
            car.drive();
        }

    }
}
