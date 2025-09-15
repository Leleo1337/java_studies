package estudos.variables;

public class Scope {

    // java uses the local variable first!!

    static int x = 3; // CLASS

    public static void main(String[] args) {

        int x = 1; // LOCAL

        System.out.println("main x: " + x);

        doSomething();
        global();
    }

    static void doSomething() {
        int x = 2; // LOCAL

        System.out.println("do something x: " + x);
    }

    static void global() {
        System.out.println("global x: " + x);
    }

}
