package Aula08;

public class Peixe extends Alimento {

    private TipoPeixe tipo;

    public Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public TipoPeixe getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Peixe " + tipo + " " + super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Peixe peixe = (Peixe) obj;
        if(this.getTipo() != peixe.getTipo()){
            return false;
        }
        return true;
    }

}
