package estudos.arithmetic;

public class Arithmetic {
    public static void main(String[] args) {

        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y
        //z = x % y

        z = x * y;

        // Augmented Assignment Operations

        int x1 = 10;
        int y1 = 2;

        //x1 += y1;
        //x1 -= y1;
        //x1 *= y1;
        //x1 /= y1;
        //x1 %= y1;

        x1 *= y1;

        // Increment and decrement Operators

        int x2 = 1;

        x2++; // 2
        x2++; // 3
        x2++; // 4
        x2--; // 3

        System.out.println(z);
        System.out.println(x1);
        System.out.println(x2);

    }
}
