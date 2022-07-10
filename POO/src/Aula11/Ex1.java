package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Map<String, Map<String, Integer>> mapa = new HashMap<>();
        

        Scanner input = new Scanner(new FileReader("src/Aula11/major.txt", StandardCharsets.UTF_8));
        input.useDelimiter("[\\p{Punct}\\s]");

        ArrayList<String> palavras = new ArrayList<>();

        while (input.hasNext()) {
            String word = input.next();
            if(word.length()>2) {
				palavras.add(word.toLowerCase());
			}
        }

        input.close();

        for(int i = 0; i < palavras.size()-1; i++){
            String atual = palavras.get(i);
            String seguinte = palavras.get(i+1);

            // System.out.println(palavras.get(i));
            if(!mapa.containsKey(atual)){
                Map<String, Integer> elemento = new HashMap<>();
                elemento.put(seguinte, 1);
                mapa.put(atual, elemento);
                // mapa.put(palavras.get(i), elemento.put(palavras.get(i+1), elemento.get(palavras.get(i))+1));
            }else{
                if(mapa.get(atual).containsKey(seguinte)){
                    mapa.get(atual).replace(seguinte, mapa.get(atual).get(seguinte)+1);
                }else{
                    mapa.get(atual).put(seguinte, 1);
                }
            }
        }
        

        for(int i = 0; i < mapa.size(); i++){
            System.out.println(mapa.entrySet().toArray()[i].toString());
        }


    }

        
    
}
