import java.util.Scanner;

public class lista01questao06 {
    public static void main(String[] args) {
        int minutosTotal;
        int dias;
        int horas;
        int minutos;

        Scanner sc = new Scanner(System.in);
        System.out.println("informe o valor em minutosTotal: ");
        minutosTotal = sc.nextInt();
        sc.close();

        dias = (minutosTotal /60)/24;
        horas = (minutosTotal/60) - (dias*24);
        minutos = minutosTotal - ((dias*24*60)+(horas*60));

        System.out.println(minutosTotal+ " = "+dias+" dias, "+horas+" horas e "+minutos+" minutos.");
    }

    public static class lista01questao07 {
    }
}
