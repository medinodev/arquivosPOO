package exercicioExtra.Conta;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente();
        cliente1.setSaldo(20000);
        System.out.println(cliente1.getSaldo());
        cliente1.realizarSaque(500);
        cliente1.realizarSaque(250);
    }
}
