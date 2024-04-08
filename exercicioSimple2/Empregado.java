package exercicioSimple2;

public class Empregado {
    protected double salario;
    protected String matricula;

    public double valorINSS(double salario){
        return salario * 0.11;
    }

    public double getSalario(){ return salario; }
}
