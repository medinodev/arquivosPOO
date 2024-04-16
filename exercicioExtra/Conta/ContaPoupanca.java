package exercicioExtra.Conta;

public class ContaPoupanca extends Conta{

     @Override
    public void realizarSaque(float valorSaque) {
        if(valorSaque <= 500){
            float saque = saldo - valorSaque;
            System.out.println("O valor sacado foi " + valorSaque + "seu saldo anterior era de " + saldo + "devido o saque" 
                               " seu saldo atual é " + saque);
        } else {
            System.out.println("Seu limite de saque é de ate R$ 500,00. O saque que voce solicitou" +
                    " excede seu limite, por favor tente novamente. " + "O valor de saque solicitado anteriormente" +
                    " foi de R$ " + valorSaque);
        }

     @Override
     public void realizarDeposito(float valorDeposito){
        if(valor > 200) {
          
    }
}
