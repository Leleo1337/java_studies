package estudos.stringMethods;

public class StrMethods {
    public static void main(String[] args) {

        String name = "     Leandro          ";
        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        name = name.trim(); // trim() removes spaces

        if (name.contains(" ")) {
            System.out.printf("The name %s contains spaces \n", name);
        } else {
            System.out.printf("The name %s does not contains spaces \n", name);
        }

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.printf("The name %s is %d characters long \n", name, length);
        System.out.printf("The second letter of the name: %s is: %s \n", name, letter);
        System.out.printf("The index of letter 'o' is: %d \n", index);
        System.out.printf("The last index of letter 'o' is: %d \n", lastIndex);
        System.out.println(name.replace("o", "a"));
    }
}
