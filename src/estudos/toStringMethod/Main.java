package estudos.toStringMethod;

public class Main {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique indentifier.
        //               It can be overriden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", "Red", 2025);
        Car car2 = new Car("Chevrolet", "Corvette", "Blue", 2025);

        System.out.println(car1);
        System.out.println(car2);

    }


}
