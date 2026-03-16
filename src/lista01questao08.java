import java.util.Scanner;

public class lista01questao08 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o codigo do setor: ");
        int codigo = sc.nextInt();
        System.out.println("Insira o valor do produto");
        double valor = sc.nextDouble();
        sc.close();


        if ((codigo==111) && (valor > 100.00)){
            System.out.println("Você recebeu um desconto! Novo valor : R$"+ (valor - (valor*0.4)));
        } else if ((codigo==111) && (valor <= 50.00) && (valor >= 100.00)) {
            System.out.println("Você recebeu um desconto! Novo valor : R$"+ (valor - (valor*0.2)));
        } else if ((codigo==111) && (valor > 0.00) && (valor <= 50.00)) {
            System.out.println("Você recebeu um desconto! Novo valor : R$"+ (valor - (valor*0.1)));
        }

        if ((codigo==222) && (valor > 500.00)){
            System.out.println("Você recebeu um desconto! Novo valor : R$"+ (valor - (valor*0.1)));
        } else if ((codigo==222) && (valor <= 500.00)) {
            System.out.println("Produto sem desconto! Valor: R$"+ valor);
        }

        if (codigo != 111 && codigo != 222){
            System.out.println("Setor invalido");
        }
    }
}
