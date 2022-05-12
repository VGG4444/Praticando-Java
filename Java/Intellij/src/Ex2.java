// VICTOR GABRIEL SOARES DOS SANTOS

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        while (true) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Escolha a operação: [1] Soma | [2] Subtração | [3] Multiplicação | [4] Divisão | [0] Parar");
            int operacao = entrada.nextInt();
            if (operacao == 0){
                break;
            }
            System.out.println("NÚmero 1: ");
            double n1 = entrada.nextDouble();
            System.out.println("NÚmero 2: ");
            double n2 = entrada.nextDouble();

            double soma = n1 + n2;
            double divisao = n1 / n2;
            double subtracao = n1 - n2;
            double multi = n1 * n2;

            if (operacao == 1){
                System.out.println(" A soma entre " + n1 + " " + n2 + " dÁ " + soma);
            }
            if (operacao == 2){
                System.out.println(" A divisao entre " + n1 + " " + n2 + " dÁ " + divisao);
            }
            if (operacao == 3){
                System.out.println(" A subtraçÃo entre " + n1 + " " + n2 + " dÁ " + subtracao);
            }
            if (operacao == 4){
                System.out.println(" A multiplicaçÃo entre " + n1 + " " + n2 + " dÁ " + multi);
            }
        }
    }
}