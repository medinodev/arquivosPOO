package exercicioSimples1;

public class Cachorro extends Animal{

    protected String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }

    public String getRaca(){ return raca; }
    public void setRaca(String raca){ this.raca = raca; }
}
