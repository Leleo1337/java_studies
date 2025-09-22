package estudos.OOP.abstraction;

public class Main {

    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Retangle retangle = new Retangle(4, 5);
        Triangle triangle = new Triangle(6, 7);

        circle.display();
        retangle.display();
        triangle.display();

        System.out.println(circle.area());
        System.out.println(retangle.area());
        System.out.println(triangle.area());

    }

}
