package Aula08;

public class Motociclo extends Veiculo{
    String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo){
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return super.toString() + " || Tipo: " + tipo;
    }
}
