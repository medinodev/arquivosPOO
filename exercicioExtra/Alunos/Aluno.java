package exercicioExtra.Alunos;

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
        for(int i = 0; i < aluno.length; i++){
                if(melhorNota <= aluno[i].nota){
                    melhorNota = aluno[i].nota;
                    estudanteMelhorNota = aluno[i];
                }
        }
        System.out.println("A melhor nota foi " + estudanteMelhorNota);
    }

    public void notaMaisBaixa(Aluno aluno[]){
        float menorNota = 0;
        Aluno estudanteMenorNota = null;
        for(int i = 0; i < aluno.length; i++){
            if(menorNota <= aluno[i].nota){
                menorNota = aluno[i].nota;
                estudanteMenorNota = aluno[i];
            }
        }
        System.out.println("A melhor nota foi " + estudanteMenorNota);
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
