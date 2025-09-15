package estudos.methods;

public class Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Leo";
        String fullname = getFullName("leleo", "xd");
        int age = 17;
        double ageSquare = square(age);

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }

        System.out.println(fullname);
        System.out.println(ageSquare);
        happyBirthDay(name, age);
    }

    static void happyBirthDay(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s! \n", name);
        System.out.printf("You are %d years old! \n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(int number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
