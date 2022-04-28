package ciclo.de.desenvolvimento;

public class Funcionario extends PessoaFisica{
    private int id_funcionario;
    private double salario;
    private int admin;
    
    public Funcionario(){}
    
    public int GetIdFuncionario(){
        return this.id_funcionario;
    }
    public double GetSalario(){
        return this.salario;
    }

    public int isAdmin() {
        return this.admin;
    }
    
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
    
}
