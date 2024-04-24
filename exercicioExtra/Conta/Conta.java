package exercicioExtra.Conta;

/*Crie uma classe Conta que possua métodos públicos (virtual) para as operações
de saque, deposito e consulta de saldo. Em seguida crie outras duas classes,
ContaCorrente e ContaPoupanca que herdam da classe Conta. Sobrescreva (override)
o método de saque da classe ContaCorrente pois deverá adicionalmente realizar um
desconto de imposto no saldo referente a 1% do valor sacado toda vez que um saque
for realizado. O limite de saque da classe ContaCorrente é de 1000 reais por operação.
Para a classe ContaPoupanca sobrescreva (override) o método de saque não
permitindo realizar nenhum tipo de desconto de imposto na operação de saque, no
entanto o limite de saque será de apenas 500 reais por operação. Na classe
ContaPoupanca sobrescreva (override) a operação de depósito permitindo somente
operações com valores superiores à 200 reais. Obs.: Informe mensagens legíveis para o
usuário toda vez que uma operação de saque ou depósito não respeitar os limites do
tipo de conta utilizado.*/

public class Conta {

    protected float saldo;

    public void realizarSaque(float valorSaque){
    }

    public void realizarDeposito(float valorDeposito){
        
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é " + saldo);
    }


}
