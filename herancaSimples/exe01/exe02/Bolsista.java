package herancaSimples.exe01.exe02;

public class Bolsista extends Estudante{
    private float valorDaBolsa;

    public void quantDeCopiasPermitidas(float valorDaBolsa){
        int aux = 0;
        float valorCop = 0.07f;
        while (valorDaBolsa >= valorCop){
            valorDaBolsa -= valorCop;
            aux++;
        }
        System.out.println("Voce pode realizar " + aux + " copias com o valor de sua bolsa");
    }

    @Override
    public void tirarCopia(int quantDeFolhas) {
        float valor = quantDeFolhas * 0.07f;
        System.out.println("O valor da cópia é R$ " + valor);

    }
}
