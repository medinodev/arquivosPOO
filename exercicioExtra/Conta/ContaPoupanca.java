package exercicioExtra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public void realizarDeposito(float valorDeposito) {
        super.realizarDeposito(valorDeposito);
        if (valorDeposito > 200) {
            //float saldoAnterior = saldo;
            saldo += valorDeposito;
            //setSaldo(somaTotal);
            System.out.println("Deposito realizado com sucesso! O valor do saldo atual é R$ " + saldo);
        } else {
            System.out.println("Falha de deposito! Somente valores maiores que R$ 200,00 podem ser realizados.");
        }
    }

    @Override
    public void realizarSaque(float valorSaque) {
        if (valorSaque <= 500) {
            //float saldoAnterior = saldo;
            saldo -= valorSaque;
            //setSaldo(saque);
            System.out.println("O valor sacado foi " + valorSaque + " seu saldo atual é " + saldo);
        } else {
            System.out.println("Seu limite de saque é de ate R$ 500,00. O saque que voce solicitou" +
                    " excede seu limite, por favor tente novamente. ");
        }

    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }
}