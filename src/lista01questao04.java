import java.util.Scanner;
import java.text.DecimalFormat;

public class lista01questao04 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe a temperatura em Graus Celsius: ");
        double grausCelsius = sc.nextDouble();
        sc.close();

        double grausFahrenheit = (grausCelsius*(9.0/5)+32);//ao menos um dos numeros da divisao precisa ser Double
        System.out.println(df.format(grausCelsius)+ "C equivale a: "+df.format(grausFahrenheit)+ "F" );
    }
}
