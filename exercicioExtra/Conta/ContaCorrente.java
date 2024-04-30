package exercicioExtra.Conta;

public class ContaCorrente extends Conta{

    @Override
    public void realizarSaque(float valorSaque) {
        if(valorSaque <= 1000){
            //float saldoAnterior = saldo;
            saldo -= valorSaque;
            float descontoImposto = valorSaque * 0.01f;
            saldo -= descontoImposto;
            //setSaldo(descontoImposto);
            System.out.println("O valor sacado foi " + valorSaque + ". Seu saldo atual " + saldo);
        } else {
            System.out.println("Seu limite de saque é de ate R$ 1000,00. O saque que voce solicitou" +
                    " excede seu limite, por favor tente novamente. ");
        }
    }

    @Override
    public void realizarDeposito(float valorDeposito) {
        super.realizarDeposito(valorDeposito);
        float saldoAnterior = saldo;
        saldo += valorDeposito;
        //setSaldo(somaTotal);
        System.out.println("Deposito de R$ " + valorDeposito +" realizado com sucesso! O valor do saldo atual é R$ " + saldo);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }
}
