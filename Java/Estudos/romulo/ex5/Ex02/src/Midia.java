
public class Midia {
int codigo;
double preco;
String nome;
void showDados() {
	System.out.println(getNome());
	System.out.println(getPreco());
	System.out.println(getCodigo());
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
}
