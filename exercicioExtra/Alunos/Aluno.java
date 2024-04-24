package exercicioExtra.Alunos;

/* Faça uma rotina que lê um array de record de tamanho 10 contendo um caderno com
o nome e a nota dos alunos (notas de 0 a 10). Em seguida leia o array e informe a nota
média da turma e o nome dos alunos com melhor e pior notas. Não é permitido o uso
de funções como: MaxValue, MaxIntValue, MinIntValue para o array com as notas,
implemente sua própria lógica de pesquisa para o array.

Campo 1 O nome do aluno
Campo 2 O nota do aluno

*/
public class Aluno {
    private String nome;
    private float nota;

    public Aluno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno(){

    }

    public float mediaTurma(Aluno aluno[]){
        float media = 0;
        for(int i = 0; i < aluno.length; i++){
            media += aluno[i].nota;
        }
        return media/ aluno.length;
    }

    public void melhorNota(Aluno aluno[]){
        float melhorNota = 0;
        Aluno estudanteMelhorNota = null;
        //Aluno estudanteMelhorNota [] = new Aluno[];
        for(int i = 0; i < aluno.length; i++){
                if(melhorNota <= aluno[i].nota){
                    melhorNota = aluno[i].nota;
                    estudanteMelhorNota = aluno[i];
                }
        }
        System.out.println("A melhor nota foi " + estudanteMelhorNota);
    }

    public void notaMaisBaixa(Aluno aluno[]){
        float menorNota = 99999;
        Aluno estudanteMenorNota = null;
        for(int i = 0; i < aluno.length; i++){
            if(menorNota > aluno[i].nota){
                menorNota = aluno[i].nota;
                estudanteMenorNota = aluno[i];
            }
        }
        System.out.println("A menor nota foi " + estudanteMenorNota);
    }

    public String getNome(){ return nome; }

    public void setNome(String nome){ this.nome = nome; }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno de " +
                "nome='" + nome + '\'' +
                ", nota=" + nota;
    }
}
