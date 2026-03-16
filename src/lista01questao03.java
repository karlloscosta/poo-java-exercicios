import java.util.Scanner;
import java.text.DecimalFormat;

public class lista01questao03 {
    static void main(String[] args) {
        double angulo, radianos;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o angulo: ");
        angulo = sc.nextDouble();
        sc.close();

        radianos = (Math.PI/180)*angulo;

        System.out.println("Angulo : "+ df.format(angulo)+ " graus");
        System.out.println("Angulo em Radianos: "+ df.format(radianos)+ " radianos");
        System.out.println("Cosseno: "+ df.format(Math.cos(radianos)));
        System.out.println("Seno: "+ df.format(Math.sin(radianos)));
        System.out.println("Tangente: "+ df.format(Math.tan(radianos)));
        System.out.println("Secante: "+ df.format(1/Math.cos(radianos)));
        System.out.println("Cossecante: "+ df.format(1/Math.sin(radianos)));
        System.out.println("Cotangente: "+ df.format(1/Math.tan(radianos)));

    }
}
