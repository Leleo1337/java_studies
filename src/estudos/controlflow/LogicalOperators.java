package estudos.controlflow;

public class LogicalOperators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        double temp = -20;
        boolean isSunny = false;

        if (temp >= 0 && temp <= 30 && isSunny) {
            System.out.println("The weather is GOOD :)");
            System.out.println("It is SUNNY outside");
        }else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather s GOOD :)");
            System.out.println("It is CLOUDY utside");
        }else if(temp > 30 || temp < 0){
            System.out.println("The weather is BAD :(");
        }
    }
}
