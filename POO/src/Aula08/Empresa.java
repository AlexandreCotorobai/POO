package Aula08;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String nome, codigopostal, email;
    String str = "";
    private List <Veiculo> frota = new ArrayList<>();

    public Empresa(String nome, String codigopostal, String email){
        this.nome = nome;
        this.codigopostal = codigopostal;
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigoPostal(String codigopostal){
        this.codigopostal = codigopostal;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCodigopostal(){
        return this.codigopostal;
    }
    public String getEmail(){
        return this.email;
    }
    public List<Veiculo> getFrota(){
        return frota;
    }

    public void addVeiculo(Object o){
        Veiculo v = (Veiculo)o;
        this.frota.add(v);
        // Veiculo[] frota2 = new Veiculo[count+1];
        // frota2[count] = v;
        // this.frota = frota2;
        // count++;
        str += v;
    }

    public boolean isEmailValido(){
        boolean valido = false;
        if(email.endsWith(".com") || email.endsWith(".pt")){
            valido = true;
        }
        if(email.contains("@")){
            valido = true;
        }
        return valido;
    }

    @Override
    public String toString(){
        return "Organizacao: " + this.getClass().getSimpleName() + " | Nome: " + nome + " | Codigo Postal: " + codigopostal + " | Email: " + email + " | Frota: " + str;
    }
}
