package Aula08;

public class Taxi extends AutoLigeiro{
    int licenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, String nrquadro, int capacidade, int licenca){
        super(matricula, marca, modelo, potencia, nrquadro, capacidade);
        this.licenca = licenca;
    }

    public void setLicenca(int licenca){
        this.licenca = licenca;
    }

    public int getLicenca(){
        return this.licenca;
    }
    @Override
    public String toString(){
        return super.toString() + " || Licenca: " + licenca;
    }
}
