package br.com.unit.ex1;
import java.util.Scanner;

public class Main {
	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Carta c1 = new Carta();
		
		c1.setEndereco("Rua 01");
		c1.setFormaEnvio("Correio");
		c1.Editar();
		c1.Anexar();
		c1.Imprimir();
		
		System.out.println("");
		
		Telegrama t1 = new Telegrama();
		
		t1.setQuantCaracter(120);
		t1.setValorTelegrama(25.99);
		t1.Pagar();
		t1.Imprimir();
		
		System.out.println("");
		
		Email e1 = new Email();
		
		e1.setEmail("tangamandapio@gmail.com");
		e1.setServidorEmail("Gmail");
		e1.Enviar();
		e1.Imprimir();
	}

}
