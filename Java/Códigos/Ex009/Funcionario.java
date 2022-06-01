package br.com.unit.MEU2;

public class Funcionario extends Empregado{

    private double salario;
    private String turno;
    private int horasTrabalho;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
    

    public Funcionario(double salario, String turno, int horasTrabalho, int id, String codigoUniforme, String numeroTelefone, String nome, int idade, String sexo) {
        super(id, codigoUniforme, numeroTelefone, nome, idade, sexo);
        this.salario = salario;
        this.turno = turno;
        this.horasTrabalho = horasTrabalho;
    }
    
    public void displayFuncionario(){
        System.out.println("DADOS DO FUNCIONÃ�RIO");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("ID: " + this.getId());
        System.out.println("Codigo do Uniforme: " + this.getCodigoUniforme());
        System.out.println("NÂº de telefone: " + this.getNumeroTelefone());
        System.out.println("SalÃ¡rio: " + this.getSalario());
        System.out.println("Turno: " + this.getTurno());
        System.out.println("Horas trabahadas: " + this.getHorasTrabalho());
    }
    
}
