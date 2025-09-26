package estudos.wrapperClasses;

public class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int e = a;
        double f = b;
        char g = c;
        boolean h = d;

        System.out.println(a.toString() + b);

        char letter = '$';
        System.out.println(Character.isLetter(letter));

        int num = Integer.parseInt("2");
        System.out.println(num + 1);
    }
}
