package br.com.unit.ex1;

public class Email extends Documento {
	private String Email;
	private String ServidorEmail;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getServidorEmail() {
		return ServidorEmail;
	}
	public void setServidorEmail(String servidorEmail) {
		ServidorEmail = servidorEmail;
	}

	public void Imprimir() {
        System.out.println("----------------");
		System.out.println(this.Email + " " + this.ServidorEmail);
        System.out.println("----------------");
	}
	public void Enviar() {
		System.out.println("Enviando E-mail...");
	}
}
