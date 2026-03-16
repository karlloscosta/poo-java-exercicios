
import java.util.Scanner;

public class lista01questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero da carta: ");
        int numeroCarta = sc.nextInt();
        System.out.println("Informe o numeor do nipe: ");
        int numeroNipe = sc.nextInt();
        sc.close();

        String carta;
        String nipe;

        switch (numeroCarta){
            case 1: carta = "ás";break;

            case 2: carta = "dois";break;

            case 3: carta = "tres";break;

            case 4: carta = "quarta";break;

            case 5: carta = "cinco";break;

            case 6: carta = "seis";break;

            case 7: carta = "sete";break;

            case 8: carta = "oito";break;

            case 9: carta = "nove";break;

            case 10: carta = "dez";break;

            case 11: carta = "valete";break;

            case 12: carta = "dama";break;

            case 13: carta = "rei";break;

            default: carta = "carta invalido";
        }


        switch (numeroNipe){
            case 1: nipe = "ouros";break;

            case 2: nipe = "paus";break;

            case 3: nipe = "copas";break;

            case 4: nipe = "espadas";break;

            default: nipe = "nipe invalido";
        }

        System.out.println(carta+ " de "+nipe);
    }
}
