import java.util.Scanner;
import java.text.DecimalFormat;

public class lista01questao02 {
    static void main(String[] args) {
        double sum;
        double media;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        sc.close();

        sum = valor1 + valor2 + valor3;
        media = sum/3;

        System.out.println("A soma dos numeros informados é: "+ df.format(sum));
        System.out.println("A media dos numeros informados é: "+ df.format(media));
    }
}
