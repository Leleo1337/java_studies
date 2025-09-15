package estudos._09Exercises.mathClass;

public class MathClass {
    public static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5); // potenciação
        result = Math.abs(-5); // valor absoluto
        result = Math.sqrt(9); // raiz quadrada
        result = Math.round(3.1); // arredonda para o inteiro mais proximo
        result = Math.ceil(3.1); // arredonda para o inteiro mais alto
        result = Math.floor(3.99); // arredonda para o inteiro mais baixo
        result = Math.max(10, 20); // retorna o valor mais alto dos parametros
        result = Math.min(10, 20); // retorna o valor mais baixo dos parametros


        System.out.println(result);
    }
}
