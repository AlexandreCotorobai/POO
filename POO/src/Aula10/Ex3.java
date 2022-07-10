package Aula10;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        String frase = "Hello World";

        Map<Character, ArrayList<Integer>> mapa = new HashMap<>();
        
        for(int i = 0; i < frase.length(); i++){
            if(!mapa.containsKey(frase.charAt(i))){
                mapa.put(frase.charAt(i), new ArrayList<>(Arrays.asList(i)));
            }else{
                mapa.get(frase.charAt(i)).add(i);
            }
        }
        System.out.println(mapa);

    }
}
