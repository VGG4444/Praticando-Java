package br.com.unit.MEU2;

public class Gerente extends Empregado {

    
    private String departamento;
    private String qualificacao;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public Gerente(String departamento, String qualificacao, int id, String codigoUniforme, String numeroTelefone, String nome, int idade, String sexo) {
        super(id, codigoUniforme, numeroTelefone, nome, idade, sexo);
        this.departamento = departamento;
        this.qualificacao = qualificacao;
    }
    
}
