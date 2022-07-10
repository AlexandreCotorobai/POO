package Aula08;

public class PesadoPass extends Veiculo{
    String nrquadro;
    int peso, passmax;

    public PesadoPass(String matricula, String marca, String modelo, int potencia, String nrquadro, int peso, int passmax){
        super(matricula, marca, modelo, potencia);
        this.nrquadro = nrquadro;
        this.peso = peso;
        this.passmax = passmax;
    }

    public void setNrquadro(String nrquadro){
        this.nrquadro = nrquadro;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setPassmax(int passmax){
        this.passmax = passmax;
    }

    public String getNrquadro(){
        return this.nrquadro;
    }
    public int getPeso(){
        return this.peso;
    }
    public int getPassmax(){
        return this.passmax;
    }

    @Override
    public String toString(){
        return super.toString() + " || Nr Quadro: " + nrquadro + " || Peso: " + peso + " || Passageiros Max: " + passmax;
    }
}
