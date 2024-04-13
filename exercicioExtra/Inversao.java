package exercicioExtra;
import java.util.Scanner;

/* Uma string é um palíndromo quando o inverso desta é igual a ela própria. Escreva uma
função que recebe uma string e retorna se essa string é ou não um palíndromo. Não é
permitido o uso da função ReverseString, implemente sua própria função de
inversão. */

public class Inversao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um nome para realizar a conferencia de palíndromos");
        String nome = leitura.nextLine();
        String palindromo = "";

        String conferenciaNome = new String();

        conferenciaNome = nome.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] inversaoNome = conferenciaNome.toCharArray();
        for (int i = inversaoNome.length - 1; i >= 0; i--){
            //System.out.println(inversaoNome[i]);
            palindromo += inversaoNome[i];
        }

        if(conferenciaNome.equals(palindromo)){
            System.out.println("As palavras digitadas sao palindromos");
        } else {
            System.out.println("Nao sao palindromos");
        }
    }
}
