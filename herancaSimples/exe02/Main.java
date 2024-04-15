package herancaSimples.exe02;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.tirarCopia(20);
        Bolsista bolsista = new Bolsista();
        bolsista.tirarCopia(20);
        bolsista.quantDeCopiasPermitidas(500);
    }
}
