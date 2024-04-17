package exercicioExtra;

import java.util.Scanner;

public class Recursividade2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para o resultado do fatorial");
        int num = leitura.nextInt();

        int resp = calcularFatorial(num);
        System.out.println(resp);

    }

    public static int calcularFatorial(int numero){
        if(numero == 1 || numero == 0){
            return 1;
        }
        return numero * calcularFatorial(numero - 1);
    }


}
