package Aula08;

public class AutoLigeiroEletric extends AutoLigeiro implements VeiculoEletrico{
    int autonomia;

    public AutoLigeiroEletric(String matricula, String marca, String modelo, int potencia, String nrquadro, int capacidade){
        super(matricula, marca, modelo, potencia, nrquadro, capacidade);
        this.autonomia = 0;
    }

    public int autonomia(){
        return this.autonomia;
    }
    public void carregar(int percentagem){
        if(percentagem > 100){percentagem=100;}
        this.autonomia = percentagem;
    }
}
