package Aula08;

public class Veiculo implements KmPercorridosInterface{
    private String matricula, marca, modelo;
    private int potencia;
    // private int[] trajeto, trajeto2;
    // private int count = 0;
    private int ultimotrajeto;
    private int distanciatotal = 0;

    public Veiculo(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getPotencia(){
        return this.potencia;
    }

    public void trajeto(int quilometros){
        this.ultimotrajeto = quilometros;
        this.distanciatotal += quilometros;
    //     trajeto2 = new int[count+1];
    //     trajeto2[count] = quilometros;
    //     trajeto = trajeto2;
    //     count++;
    }
    public int ultimoTrajeto(){
        return this.ultimotrajeto;
    }
    public int distanciaTotal(){
        return this.distanciatotal;
        // int max = trajeto[0];
        // for(int i = 1; i < trajeto.length; i++){
        //     if(trajeto[i] > max){
        //         max = trajeto[i];
        //     }
        // }
        // return max;
    }

    public boolean isMatriculaValida() {
        if (matricula.length() != 6) { //Considerei o novo formato de matriculas
            return false;
        }

        boolean valido = true;

        if(!Character.isDigit(matricula.charAt(0))){
            valido = false;
        }else if(!Character.isDigit(matricula.charAt(1))){
            valido = false;
        }else if(Character.isDigit(matricula.charAt(2))){
            valido = false;
        }else if(Character.isDigit(matricula.charAt(3))){
            valido = false;
        }else if(!Character.isDigit(matricula.charAt(4))){
            valido = false;
        }else if(!Character.isDigit(matricula.charAt(5))){
            valido = false;
        }
        return valido;
    }


    @Override
    public boolean equals(Object o) {
        Veiculo v = (Veiculo)o;
        if ((this.getMatricula() == v.getMatricula()) && (this.getMarca() == v.getMarca()) && (this.getModelo() == v.getModelo()) && (this.getClass().getSimpleName() == v.getClass().getSimpleName())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "\nTipo: " + this.getClass().getSimpleName() + " || Matricula: " + matricula + " || Marca: " + marca + " || Modelo: " + modelo + " || Potencia: " + potencia; 
    }
}
