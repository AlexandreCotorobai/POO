package Aula10;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> mapa = new HashMap<>();
        mapa.put("MD", new ArrayList<>(Arrays.asList("Matematica", "Discreta")));
        mapa.put("MSF", new ArrayList<>(Arrays.asList("Modelacao")));
        mapa.put("IAC", new ArrayList<>(Arrays.asList("Zeros", "Uns")));
        mapa.put("NA", new ArrayList<>(Arrays.asList("Undefined")));
        mapa.put("NA2", new ArrayList<>(Arrays.asList("Undefined2")));
        
        mapa.get("MSF").add("Sistemas");
        mapa.get("MSF").add("Fisicos");
        System.out.println(mapa.size());
        System.out.println(mapa);

        mapa.remove("IAC");
        System.out.println(mapa.size());
        System.out.println(mapa);
        System.out.println("get MD -> " + mapa.get("MD"));

        mapa.replace("MD", new ArrayList<>(Arrays.asList("Afinal vou passar")));
        System.out.println(mapa);

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        
        System.out.println("-----------------------");
        System.out.println(meaningPicker(mapa, "MSF"));
        
    }
    public static String meaningPicker(Map<String, ArrayList<String>> mapa, String termo){
        int size = (int) mapa.get(termo).size();
        int random = (int)(Math.random()*size);
        // System.out.println(random);
        // System.out.println(mapa.get(termo).get(random));

        return mapa.get(termo).get(random);
    }
}
