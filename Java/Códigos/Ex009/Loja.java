package br.com.unit.MEU2;

import java.util.Scanner;
import java.util.ArrayList;

public class Loja {
	private String nomeLoja;
	private String localLoja;
	private String numeroContrato;

	Scanner entrada = new Scanner(System.in);

	public Loja(String nomeLoja, String localLoja, String numeroContrato) {

	}

	public Loja(String nomeLoja, String localLoja, String numeroContrato, ArrayList<Proprietario> proprietario,
			ArrayList<Diretor> diretores, ArrayList<Contador> contadores, ArrayList<Funcionario> funcionarios,
			ArrayList<Produto> produtos) {

	}

	private ArrayList<Proprietario> Proprietario = new ArrayList<>();
	private ArrayList<Diretor> Diretor = new ArrayList<>();
	private ArrayList<Contador> Contador = new ArrayList<>();
	private ArrayList<Funcionario> Funcionario = new ArrayList<>();
	private ArrayList<Produto> Produto = new ArrayList<>();

	public ArrayList<Diretor> getDiretores() {
		return Diretor;
	}

	public ArrayList<Produto> getProdutos() {
		return Produto;
	}

	public ArrayList<Proprietario> getProprietarios() {
		return Proprietario;
	}

	public ArrayList<Contador> getContadores() {
		return Contador;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return Funcionario;
	}

	
	public void adicionarDiretor(Diretor diretor) {
		this.getDiretores().add(diretor);
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		this.getFuncionarios().add(funcionario);
	}

	public void adicionarContador(Contador contador) {
		this.getContadores().add(contador);
	}

	public void adicionarProprietario(Proprietario proprietario) {
		this.getProprietarios().add(proprietario);
	}

	public void adicionarProduto(Produto produto) {
		this.getProdutos().add(produto);
	}

	
	public void imprimirProdutos() {
		try {
			//for (Produto produtos : this.Produto)
				//produtos.displa
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void imprimirDiretores() {
		try {
			for (Diretor diretor : this.Diretor)
				diretor.displayDiretor();
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}

		}
		
	public void imprimirProprietarios() {
		try {
			for (Proprietario proprietario : this.Proprietario)
				proprietario.displayProprietario();
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

	public void imprimirContador() {
		try {
			for (int i = 0; i < Contador.size(); i++)
				System.out.println(Contador.get(i));
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

	public void imprimirFuncionarios() {
		try {
			for (int i = 0; i < Funcionario.size(); i++)
				System.out.println(Funcionario.get(i));
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
	public void imprimirProdutosPorCategoria() {
		
	}

}
