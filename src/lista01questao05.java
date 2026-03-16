import java.util.Scanner;

public class lista01questao05 {
    static void main(String[] args) {
        int unidade, dezena, centena, numero, numeroInvertido;

        Scanner sc = new Scanner(System.in);

        System.out.println("informe um numero de 3 digitos: ");
        numero = sc.nextInt();
        sc.close();

        unidade = numero%10;
        dezena = (numero/10)%10;
        centena = (numero/100);
        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);

        //UCD
        System.out.println(numero);
        numeroInvertido = (unidade*100)+(centena*10)+(dezena);
        System.out.println(numeroInvertido);

    }

}
