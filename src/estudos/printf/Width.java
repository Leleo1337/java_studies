package estudos.printf;

public class Width {
    public static void main(String[] args) {

        // printf() is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%04d \n", id3);
        System.out.printf("%04d \n", id4);
    }
}
