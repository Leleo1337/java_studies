package variaveis;

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

        int minhaIdade = 17;
        String meuNome = "Leo";
        char inicial = 'L';
        boolean maiorDeIdade = minhaIdade >= 18;

        System.out.println("Eu sou " + meuNome + ", tenho " + minhaIdade + " anos");
        System.out.println("Minha inicial é " + inicial);
        System.out.println("Sou maior de idade? " + (maiorDeIdade ? "Sim": "Não"));
    }
}
