import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<DVD> listaDVDs = new ArrayList<>();
		ArrayList<CD> listaCDs = new ArrayList<>();
		while (true) {
			System.out.println("Escolha uma opção");
			System.out.println("1.Cadastro de CD \n2.Cadastro de DVD \n3.Mostrar CDs e DVDs cadastrados");

			int menu = entrada.nextInt();
			if (menu == 0) {
				break;
			}
			if (menu == 1) {

				CD novoCd = new CD();
				System.out.println("Nome do CD");
				novoCd.setNome(entrada.next());
				System.out.println("Codigo do CD");
				novoCd.setCodigo(entrada.nextInt());
				System.out.println("Preço do CD:");
				novoCd.setPreco(entrada.nextDouble());
				listaCDs.add(novoCd);

			}

			if (menu == 2) {
				DVD novoDVD = new DVD();
				System.out.println("Nome do DVD");
				novoDVD.setNome(entrada.next());
				System.out.println("Codigo do CD");
				novoDVD.setCodigo(entrada.nextInt());
				System.out.println("Preço do CD:");
				novoDVD.setPreco(entrada.nextDouble());
				listaDVDs.add(novoDVD);
			}

			
			  if(menu==3) {
				  System.out.println("CDs cadastrados:");
				  for (CD teste : listaCDs) {
					
						System.out.println(teste.getNome());	}
				  System.out.println("DVDs cadastrados:");
				  for (DVD teste2: listaDVDs) {
					 
					  System.out.println(teste2.getNome());
						
						}
			  }
			 

		}
	}
}