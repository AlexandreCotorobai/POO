package Aula08;

public class PesadoPassEletric extends PesadoPass implements VeiculoEletrico {
    int autonomia;
    
    public PesadoPassEletric(String matricula, String marca, String modelo, int potencia, String nrquadro, int peso, int passmax){
        super(matricula, marca, modelo, potencia, nrquadro, peso, passmax);
    }

    public int autonomia(){
        return this.autonomia;
    }
    public void carregar(int percentagem){
        if(percentagem > 100){percentagem=100;}
        this.autonomia = percentagem;
    }
}
