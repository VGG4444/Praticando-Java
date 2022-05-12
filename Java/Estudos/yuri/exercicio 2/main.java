import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos alunos deseja cadastrar?");
        int n = sc.nextInt();
        ArrayList<String>[] alunosENotas = new ArrayList[n];
        String[] alunos = new String[n];
        for(int i = 0; i < n; i++){
            System.out.println("digite o nome do aluno para cadastro");
            cadastrarAlunos(alunos,i);
            System.out.println("digite o nome do alun");
            cadastrarNotas(alunosENotas,i);
        }
        

    System.out.println("Notas cadastradas: " + Arrays.toString(alunosENotas));
    }

    


    public static void cadastrarAlunos(String[] array, int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        array[i] = nomeAluno;
    }

    public static void cadastrarNotas(ArrayList<String>[] array, int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno para cadastrar suas notas: ");
        String nomeAluno = sc.nextLine();
        System.out.println("Digite a 1 nota do aluno: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a 2 nota do aluno: ");
        int nota2 = sc.nextInt();
        System.out.println("Digite a 3 nota do aluno: ");
        int nota3 = sc.nextInt();

        
        
        
        double media = (nota1 + nota2 + nota3)/3;
        ArrayList<String> notas = new ArrayList<String>();
        notas.add(nomeAluno);
        notas.add(String.valueOf(media));
        array[i] = notas;
        System.out.println("Notas cadastradas com sucesso!");
    }

}
