package br.com.unit.MEU2;


public class Contador extends Gerente {
    private double salario;
    private String turno;
    private int horaTrabalho;

    public Contador(double salario, String turno, int horaTrabalho, String departamento, String qualificacao, int id, String codigoUniforme, String numeroTelefone, String nome, int idade, String sexo) {
        super(departamento, qualificacao, id, codigoUniforme, numeroTelefone, nome, idade, sexo);
        this.salario = salario;
        this.turno = turno;
        this.horaTrabalho = horaTrabalho;
    }

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

    public int getHoraTrabalho() {
        return horaTrabalho;
    }

    public void setHoraTrabalho(int horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }
    
    public void displayContador(){
        System.out.println("DADOS CONTADOR");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("ID: " + this.getId());
        System.out.println("Código uniforme: " + this.getCodigoUniforme());
        System.out.println("Nº do telefone: " + this.getNumeroTelefone());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Qualificação: " + this.getQualificacao());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Turno de trabalho: " + this.getTurno());
        System.out.println("Horas trabalhadas: " + this.getHoraTrabalho());
    }
}
