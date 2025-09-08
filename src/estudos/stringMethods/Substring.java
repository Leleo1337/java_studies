package estudos.stringMethods;

import java.util.Scanner;


public class Substring {
    public static void main(String[] args) {

        //  .substring() = A method used to extract a portion of a string;
        //  string.substring(start,end)


        Scanner scanner = new Scanner(System.in);

        String email;
        int atIndex;
        String username;
        String domain;

        System.out.print("Enter your e-mail: ");
        email = scanner.next();

        if (email.contains("@")) {
            System.out.println("Valid e-mail");
        } else {
            System.out.println("Invalid format");
            System.out.println("Emails must contain @");
            return;
        }

        atIndex = email.indexOf("@");
        username = email.substring(0, atIndex);
        domain = email.substring(atIndex + 1);

        System.out.println(username);
        System.out.println(domain);


        scanner.close();
    }
}
