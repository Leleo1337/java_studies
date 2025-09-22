package estudos.OOP.abstraction;

public class Retangle extends Shape {

    double length;
    double width;

    Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
