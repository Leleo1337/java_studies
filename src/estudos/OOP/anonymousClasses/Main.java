package estudos.OOP.anonymousClasses;

public class Main {
    public static void main(String[] args) {

        // Anonymous class = A class that doesn't have a nave. Cannot be reused.
        //                   Add a custom behaviour without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}
