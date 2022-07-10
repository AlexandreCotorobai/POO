package Aula08;

public class Cereal extends Alimento implements ComidaVegetariana{
    private String nome;

    public Cereal(String nome, double proteinas, double calorias, double peso) {
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
        return String.format("Cereal " + nome + " " + super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cereal cereal = (Cereal) obj;
        if (this.getNome() != cereal.getNome()) {
            return false;
        }
        return true;
    }


}
