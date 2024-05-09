package poo.at4;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    
    public Funcionario() {
        
    }
    
    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public abstract double calculaPagamento();
}

// BIANCA GARCIA SUSUKI