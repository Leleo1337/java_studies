package estudos.printf;

public class Flags {
    public static void main(String[] args) {

        // printf() is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in () (removes -)
        // space = display a minus if negative, space if positive

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        System.out.printf("%,.1f \n", price1);
        System.out.printf("%+.2f \n", price2);
        System.out.printf("%(.3f \n", price3);
    }
}
