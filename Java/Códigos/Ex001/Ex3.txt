// VICTOR GABRIEL SOARES DOS SANTOS

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade pessoas: ");
        int quantidade_pessoas = entrada.nextInt();
        while (true) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Idade: ");
            int idade = entrada.nextInt();
            System.out.println("Altura(m): ");
            double altura = entrada.nextDouble();
            System.out.println("Peso(Kg): ");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);

            contador += 1;


            if (imc <= 18.5) {
                System.out.println(nome + " está abaixo do peso com o IMC de: " + imc);
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println(nome + " está dentro do normal com o IMC de: " + imc);
            }
            if (imc >= 25 && imc <= 29.9) {
                System.out.println(nome + " possui Sobrepeso com o IMC de: " + imc);
            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println(nome + " possui Obesidade 1 com o IMC de: " + imc);
            }
            if (imc >= 35 && imc <= 39.9) {
                System.out.println(nome + " possui Obesidade 2 com o IMC de: " + imc);
            }
            if (imc >= 40) {
                System.out.println(nome + " possui Obesidade 3 ou Mórbida com o IMC de: " + imc);
            }
            if (contador == quantidade_pessoas){
                break;
            }
        }
    }
}
