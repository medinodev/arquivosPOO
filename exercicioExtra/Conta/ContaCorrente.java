package exercicioExtra.Conta;

public class ContaCorrente extends Conta{

    float saldo = 10000f;

    @Override
    public void realizarSaque(float valorSaque) {
        if(valorSaque <= 1000){
            float saque = saldo - valorSaque;
            float descontoImposto = saque * 0.99f;
            System.out.println("O valor sacado foi " + valorSaque + "seu saldo anterior era de " + saldo + "devido o saque, " +
                    "eh cobrado uma taxa de imposto de 1% sobre o saldo restante, ficando seu saldo atual com " + descontoImposto);
        } else {
            System.out.println("Seu limite de saque é de ate R$ 1000,00. O saque que voce solicitou" +
                    " excede seu limite, por favor tente novamente. " + "O valor de saque solicitado anteriormente" +
                    " foi de R$ " + valorSaque );
        }


    }
}
