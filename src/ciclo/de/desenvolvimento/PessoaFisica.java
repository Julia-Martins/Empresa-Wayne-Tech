package ciclo.de.desenvolvimento;

public class PessoaFisica extends Pessoa{
    private int rg;
    private int cpf;
    private String tipo;
    
    public PessoaFisica(){}
    
    public int getCpf(){
        return this.cpf;
    }
    
    public int getRg(){
        return this.rg;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

