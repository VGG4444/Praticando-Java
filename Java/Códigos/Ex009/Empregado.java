package br.com.unit.MEU2;

public class Empregado extends Pessoa {
    private int id;
    private String codigoUniforme;
    private String numeroTelefone;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoUniforme() {
        return codigoUniforme;
    }

    public void setCodigoUniforme(String codigoUniforme) {
        this.codigoUniforme = codigoUniforme;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    

    public Empregado(int id, String codigoUniforme, String numeroTelefone, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.id = id;
        this.codigoUniforme = codigoUniforme;
        this.numeroTelefone = numeroTelefone;
    }
    
    
    
}
