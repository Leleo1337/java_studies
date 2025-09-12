package estudos;

import java.util.Scanner;

public class SymbolsGrid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int cols = 0;
        char symbol;

        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();

        System.out.print("Enter symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
