package estudos.OOP.agreggation;

public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.printf("the %s %s \n", this.year, this.name);
        System.out.println("Books avaliable: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }

}
