package exercicioExtra.Conta;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente();
        cliente1.saldo = 20000;
        cliente1.consultarSaldo();
        cliente1.realizarSaque(700);
        cliente1.realizarSaque(200);
        cliente1.realizarDeposito(500);
        cliente1.consultarSaldo();
        System.out.println("");

        ContaPoupanca cliente2 = new ContaPoupanca();
        cliente2.saldo = 1000;
        cliente2.realizarSaque(400);
        cliente2.realizarSaque(500);
        cliente2.realizarDeposito(300);
        cliente2.consultarSaldo();
    }
}
