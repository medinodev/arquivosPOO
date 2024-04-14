package exercicioExtra;
import java.util.Scanner;

/* Implemente duas funções, uma recursiva e uma com loop que, dados dois números
inteiros X e N, calcula o valor de “X elevado a potência de N” */

public class Recursividade {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o numero desejado");
        float numero = leitura.nextFloat();
        System.out.println("Digite o numero que ele será elevado");
        int expoen = leitura.nextInt();
        float aux = 1;

        float resp = calcularPotencia(numero, expoen);
        System.out.println("Utilizando a responsividade");
        System.out.println(resp);
        System.out.println("--------------");

        for(int i = 1; i <= expoen; i++){
            aux *= numero;
        }
        System.out.println("Utilizando FOR");
        System.out.println(aux);

    }

    public static float calcularPotencia(float num1, int exp){
        if(exp == 0){
            return 1;
        } else {
            return num1 * calcularPotencia(num1 * 1, exp - 1);
        }

    }

}