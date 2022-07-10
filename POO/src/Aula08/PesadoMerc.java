package Aula08;

public class PesadoMerc extends Veiculo {
    String nrquadro;
    int peso, cargamax;

    public PesadoMerc(String matricula, String marca, String modelo, int potencia, String nrquadro, int peso, int cargamax){
        super(matricula, marca, modelo, potencia);
        this.nrquadro = nrquadro;
        this.peso = peso;
        this.cargamax = cargamax;
    }

    public void setNrquadro(String nrquadro){
        this.nrquadro = nrquadro;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setCargamax(int cargamax){
        this.cargamax = cargamax;
    }

    public String getNrquadro(){
        return this.nrquadro;
    }
    public int getPeso(){
        return this.peso;
    }
    public int getCargamax(){
        return this.cargamax;
    }

    
    @Override
    public String toString(){
        return super.toString() + " || Nr Quadro: " + nrquadro + " || Peso: " + peso + " || Carga Max: " + cargamax;
    }
}
