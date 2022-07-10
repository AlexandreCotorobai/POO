package Aula10;

import java.util.*;
import java.util.Map.Entry;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("MD", "Vou chumbar");
        mapa.put("MSF", "Ninguem sabe o q esta a fazer");
        mapa.put("IAC", "Não gosto de assembly");
        mapa.put("NA", "Nao sei");
        mapa.put("NA2", "Continuo sem saber");
        System.out.println(mapa.size());
        System.out.println(mapa);
        mapa.remove("IAC");
        System.out.println(mapa.size());
        System.out.println(mapa);
        System.out.println("get - " + mapa.get("MD"));

        mapa.replace("MD", "Afinal vou passar");
        System.out.println(mapa);

        Set<Entry<String,String>> set = mapa.entrySet();

        for(Entry<String, String> i: set){
            System.out.println(i.getKey() + " -> " + i.getValue());
        }
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        
        
    }
}
