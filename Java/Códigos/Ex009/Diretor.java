package br.com.unit.MEU2;

public class Diretor  extends Gerente{

    private double salario;
    private String turno;
    private int horaTrabalho;
    
    public Diretor(double salario, String turno, int horaTrabalho, String departamento, String qualificacao, int id, String codigoUniforme, String numeroTelefone, String nome, int idade, String sexo) {
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

    public int getHoratrabalho() {
        return horaTrabalho;
    }

    public void setHoratrabalho(int horatrabalho) {
        this.horaTrabalho = horatrabalho;
    }
    
    public void displayDiretor(){
        System.out.println("DADOS DO DIRETOR");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("ID:" + this.getId());
        System.out.println("Nº Telefone: " + this.getNumeroTelefone());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Qualificação: " + this.getQualificacao());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Turno de trabalho: " + this.getTurno());
        System.out.println("Horas trabalhadas: " + this.getHoratrabalho());
    }
}
