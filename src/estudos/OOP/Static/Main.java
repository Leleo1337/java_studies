package estudos.OOP.Static;

public class Main {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        Friend friend4 = new Friend("Squidward");
        Friend friend5 = new Friend("Gary");

        Friend.showFriends();
        System.out.println(Friend.numOfFriends);
    }
}
