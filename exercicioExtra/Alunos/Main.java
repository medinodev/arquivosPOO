package exercicioExtra.Alunos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        Aluno alunos[] = new Aluno[3];

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno");
            String nome = leitura.nextLine();
            leitura.nextLine();
            System.out.println("Digite a nota");
            float nota = leitura.nextFloat();
            leitura.nextLine();

            Aluno alunosConcat = new Aluno(nome, nota);
            alunos[i] = alunosConcat;

        }

        for (int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }

        Aluno alunoss = new Aluno();
        System.out.println("A media das notas sao " + alunoss.mediaTurma(alunos));
        alunoss.melhorNota(alunos);
        alunoss.notaMaisBaixa(alunos);
    }

}
