package Aula08;

public class Alimento {
    private double proteinas;
    private double calorias;
    private double peso;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Proteínas %.1f, calorias %.1f, Peso %.1f", proteinas, calorias, peso);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Alimento ali = (Alimento) obj;
        if (this.getCalorias() != ali.getCalorias()){
            return false;
        }
        if (this.getPeso() != ali.getPeso()){
            return false;
        }
        if (this.getProteinas() != ali.getProteinas()){
            return false;
        }
        return true;
    }
}
