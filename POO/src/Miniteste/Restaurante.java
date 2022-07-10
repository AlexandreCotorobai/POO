package Miniteste;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Restaurante {
    List<String[]> pratos = new ArrayList<>();
    Map<String, ArrayList<Cliente>> mapaClientes = new HashMap<>();
    String[] pratosBonitos;


    public Restaurante() throws IOException {
        this.carregarPratos();
    }
    
    public void imprimirPratoMaisConsumido(){
        Map<String, Integer> consumidos = new HashMap<>();
        for (String[] prato : pratos) {
            String nomePrato = prato[0];
            if(!consumidos.containsKey(nomePrato)){
                consumidos.put(nomePrato,0);
            }else{
                consumidos.replace(nomePrato, consumidos.get(nomePrato)+1);
            }
        }
        int max = 0;
        for(int i : consumidos.values()){
            if(i > max){
                max = i;
            }
        }

        for (String[] prato : pratos) {
            if(consumidos.get(prato) == max){
                System.out.println(prato[0]);
            }else{
                System.out.println("");
            }
        }
    }
        



    public String pedirPratoAleatorio(Cliente c) throws IOException{
        int i = 0;
        int random = (int) (Math.random()*pratos.size());
        // System.out.println(pratos.get(random)[0]);
        String s = pratos.get(random)[0] + "(" + pratos.get(random)[1]+ "$; " + pratos.get(random)[2]+"kcal)";
        if(mapaClientes.containsKey(s)){
            mapaClientes.get(s).add(c);
        }else{
            ArrayList<Cliente> lista = new ArrayList<>();
            lista.add(c);
            mapaClientes.put(s, lista);
        }
        pratosBonitos[i] = s;
        
        return s;
    }

    public void carregarPratos() throws IOException {
        Scanner input = new Scanner(new FileReader("src/Miniteste/menu.csv", StandardCharsets.UTF_8));

        
        while (input.hasNext()) {
            String[] word = input.nextLine().split(";");
            pratos.add(word);
        }

        input.close();
        pratosBonitos = new String[pratos.size()];
    }
    public void listarPratosEClientes(){
        String s = "";
        for (Map.Entry<String, ArrayList<Cliente>> entry : mapaClientes.entrySet()) {
            s += "Prato: " + entry.getKey().toString() +"\n";
            for(Cliente j: entry.getValue()){
                s += "\t" + j.toString() + "\n";
            }
        }
        System.out.println(s);
    }

    
 
}
