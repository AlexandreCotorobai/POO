package Aula08;

public class Legume extends Alimento implements ComidaVegetariana {
    private String nome;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVegetarian() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Legume " + nome + " " + super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Legume legume = (Legume) obj;
        if(this.getNome() != legume.getNome()){
            return false;
        }
        return true;
    }


}
