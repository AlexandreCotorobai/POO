package Aula08;

public class Carne extends Alimento{
    private VariedadeCarne tipo;

    public Carne(VariedadeCarne tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public VariedadeCarne getTipo() {
        return tipo;
    }

    public void setTipo(VariedadeCarne tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Carne " + tipo + " " + super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!super.equals(obj)){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Carne carne = (Carne) obj;
        if (this.getTipo() != carne.getTipo()){
            return false;
        }
        return true;
    }
}
