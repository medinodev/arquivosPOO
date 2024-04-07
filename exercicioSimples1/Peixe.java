package exercicioSimples1;

public class Peixe extends Animal{

    protected String tipoHabitat;

    @Override
    public String toString() {
        return "Peixe{" +
                "tipoHabitat='" + tipoHabitat + '\'' +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }

    public String getTipoHabitat(){ return tipoHabitat; }
    public void setTipoHabitat(String tipoHabitat){ this.tipoHabitat = tipoHabitat; }

}
