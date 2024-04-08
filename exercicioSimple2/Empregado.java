package exercicioSimple2;

public class Empregado {
    protected double salario;
    protected String matricula;

    public double valorINSS(double salario){
        return salario * 0.11;
    }

    public double getSalario(){ return salario; }
    public void setSalario(double salario) { this.salario = salario; } 

    public String getMatricula(){ return matricula; } 
    public void setMatricula(String matricula) { this.matricula = matricula; }
    //Se o metodos abastrato tiver sido implementado na classe mãe, não é obrigatório que as classes filhas tenham também. 
}
