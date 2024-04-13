package exercicioExtra;
import java.util.Scanner;

/*
*    Escreva uma função que recebe como entrada três números inteiros maiores que zero
*    que representam os lados de um triângulo e que deve retornar como resposta que tipo
*    de triângulo é aquele. Caso os valores informados não sejam de um triângulo válido
*     (quando a soma de dois lados é menor que o terceiro) a função deve informar isso.
*                     Nome de Triângulo - - - - Descrição
*                          Escaleno - - - - Possui todos os três lados diferentes
*                          Isósceles - - - Possui dois lados iguais
*                          Equilátero - - - Possui três lados iguais
*/

public class Triangulos {

    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do lado A do triangulo");
        float valorLadoA = leitura.nextFloat();
        System.out.println("Digite o valor do lado B do triangulo");
        float valorLadoB = leitura.nextFloat();
        System.out.println("Digite o valor do lado C do triangulo");
        float valorLadoC = leitura.nextFloat();

        if(valorLadoA + valorLadoB > valorLadoC && valorLadoA + valorLadoC > valorLadoB && valorLadoB + valorLadoC > valorLadoB){
            System.out.println("O triangulo inserido é valido.");
            if(valorLadoA == valorLadoB && valorLadoB == valorLadoC){
                System.out.println("Triângulo Equilatero - Possui todos os seus lado iguais");
            } else if(valorLadoA != valorLadoB && valorLadoA != valorLadoC){
                System.out.println("Triângulo Escaleno - Possui todos os seus lado diferentes");
            } else {
                System.out.println("Triângulo Isósceles - Possui dois lados iguais");
            }
        } else {
            System.out.println("O triangulo inválido.");
        }
}   }


