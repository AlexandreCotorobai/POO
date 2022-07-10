package Aula08;

public class AutoLigeiro extends Veiculo {
    private int capacidade;
    private String nrquadro;
    public AutoLigeiro(String matricula, String marca, String modelo, int potencia, String nrquadro, int capacidade){
        super(matricula, marca, modelo, potencia);
        this.nrquadro = nrquadro;
        this.capacidade = capacidade;
    }

    public void setNrquadro(String nrquadro){
        this.nrquadro = nrquadro;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public String getNrquadro(){
        return this.nrquadro;
    }
    public int getCapacidade(){
        return this.capacidade;
    }

    @Override
    public String toString(){
        return super.toString() + " || Nr Quadro: " + nrquadro + " || Capacidade: " + capacidade;
    }
}
