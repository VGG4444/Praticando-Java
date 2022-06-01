// VICTOR GABRIEL SOARES DOS SANTOS

import java.util.Scanner;

public class Main
{

    public static void main (String[] args)
    {
        while (true) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Nome do aluno: ");
            String nome = entrada.next();
            System.out.println("Primeira nota: ");
            double nota1 = entrada.nextDouble();
            System.out.println("Segunda nota: ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;

            if (media>=6){
                System.out.println("Aluno " + nome + " teve média " + media + " e foi aprovado!");
            }
            if (media < 6){
                System.out.println("Aluno " + nome + " teve média " + media + " e foi reprovado!");
            }
            System.out.println("Se quiser parar digite -1: ");
            int pergunta = entrada.nextInt();
            if (pergunta == -1){
                break;
            }
        }
        System.out.println("Obrigado por usar!");
    }
}