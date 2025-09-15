package estudos.arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        // 2D Array = An array where each element is an array
        //            Usefull for storing a matrix of data

        /*
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chiken", "pork", "beef", "fish"};
        */

        String[][] groceries = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chiken", "pork", "beef", "fish"}
        };

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }

}
