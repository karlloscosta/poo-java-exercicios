import java.util.Scanner;

public class lista01questao07 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Informe o terceiro numero: ");
        int n3 = sc.nextInt();
        sc.close();

        int menorN = n1;

        if(n2<menorN){
            menorN = n2;
        }
        if (n3<menorN) {
            menorN = n3;
        }

        System.out.println("o menor numero é: "+menorN);
    }
}
