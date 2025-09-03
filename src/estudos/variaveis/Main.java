package estudos.variaveis;

public class Main {
    public static void main(String[] args) {
        /*
         Tipos de dados em Java:

         // Números inteiros
         byte   => 8 bits  => -128 a 127
         short  => 16 bits => -32.768 a 32.767
         int    => 32 bits => -2.147.483.648 a 2.147.483.647
         long   => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

         // Números decimais
         float  => 32 bits => precisão simples
         double => 64 bits => precisão dupla

         // Texto e caracteres
         String => sequência de caracteres (palavras, frases)
         char   => um único caractere, sempre entre aspas simples ('a', 'b', 'c')

         // Booleanos
         boolean => true ou false
        */

        int age = 17;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("R$ " +price);

    }
}
