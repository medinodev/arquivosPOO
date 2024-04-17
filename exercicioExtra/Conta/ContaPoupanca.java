package exercicioExtra.Conta;

public class ContaPoupanca extends Conta {

    protected float valor;

    @Override
    public void realizarDeposito(float valorDeposito) {
        super.realizarDeposito(valorDeposito);
        if (valor > 200) {
            float somaTotal = saldo + valorDeposito;
            System.out.println("Deposito realizado com sucesso! O valor do saldo atual é R$ " + somaTotal);
        } else {
            System.out.println("Falha de deposito! Somente valores maiores que R$ 200,00 podem ser realizados.");
        }
    }

    @Override
    public void realizarSaque(float valorSaque) {
        if (valorSaque <= 500) {
            float saque = saldo - valorSaque;
            System.out.println("O valor sacado foi " + valorSaque + "seu saldo anterior era de " + saldo + "devido o saque" +
                    " seu saldo atual é " + saque);
        } else {
            System.out.println("Seu limite de saque é de ate R$ 500,00. O saque que voce solicitou" +
                    " excede seu limite, por favor tente novamente. " + "O valor de saque solicitado anteriormente" +
                    " foi de R$ " + valorSaque);
        }

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}