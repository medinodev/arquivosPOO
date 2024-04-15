package herancaSimples.exe02;

public class Estudante extends Instituicao{
    private String matricula;
    private String anoDeIngresso;
    private String curso;

    @Override
    public void tirarCopia(int quantDeFolhas) {
        super.tirarCopia(quantDeFolhas);
        float valor = quantDeFolhas * 0.1f;
        System.out.println("O valor da cópia é R$ " + valor);
    }

    public String getMatricula(){ return matricula; }
    public void setMatricula(String matricula){ this.matricula = matricula; }

    public String getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(String anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
