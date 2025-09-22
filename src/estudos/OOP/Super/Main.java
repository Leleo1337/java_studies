package estudos.OOP.Super;

public class Main {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("leo", "leleo");
        Student student = new Student("leleo", "leo", 3.5);
        Employee employee = new Employee("leleo", "leoleo", 2000);

        person.showName();

        student.showName();
        student.showGpa();

        employee.showName();
        employee.showSalary();
    }
}
