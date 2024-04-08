package exercicioSimple2;

public class Cliente extends Pessoa{
    protected double valorDivida;
    protected int anoNascimento;

    public double getValorDivida() { return valorDivida; }

    public void setValorDivida(double valorDivida) { this.valorDivida = valorDivida; }

    public int getAnoNascimento() { return anoNascimento; }

    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }

    //TO-DO: Criar toString com nome, idade, sexo, valor da dívida e ano de nascimento.
}
