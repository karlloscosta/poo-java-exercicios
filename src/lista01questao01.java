//Escreva um programa que calcule a área de um quadrado.
// O valor do lado de um quadrado deverá ser informado pelo usuário.

import java.util.Scanner;
import java.text.DecimalFormat;


public class lista01questao01 {

    static void main(String[] args) {
        double area;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("Informe o valor do lado do quadro em metros");
        double lado = sc.nextDouble();

        area = lado*lado;
;
        System.out.printf("O Valor da area do quadrado mede: " + df.format(area)+ " metros quadrados");
    }
}
