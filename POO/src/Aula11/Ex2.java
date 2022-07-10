package Aula11;

import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner inputC = new Scanner(new FileReader("src/Aula11/companhias.txt", StandardCharsets.UTF_8));
        Scanner inputV = new Scanner(new FileReader("src/Aula11/voos.txt", StandardCharsets.UTF_8));
        TreeMap<String,String> companhias = new TreeMap<>();
        ArrayList<Voos> listaVoos = new ArrayList<>();

        while (inputC.hasNext()) {
            String[] word = inputC.nextLine().split("\t");
			companhias.put(word[0],word[1]);
        }

        Voos.setCompanhias(companhias);

        inputC.close();

        inputV.nextLine();
        while(inputV.hasNextLine()){
            String[] linha = inputV.nextLine().split("[\t]");
            if (linha.length == 4) {
				listaVoos.add(new Voos(linha[0], linha[1], linha[2], linha[3]));
			} else {
				listaVoos.add(new Voos(linha[0], linha[1], linha[2]));
			}
        }
        inputV.close();

        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-15s%n", "Hora", "Voo", "Companhia",	"Origem", "Atraso", "Obs");
        for(Voos v:listaVoos){
            System.out.println(v);
        }


        ////b)
        PrintWriter info = new PrintWriter(new File("src/Aula11/Infopublico.txt"));
        info.printf("%-15s %-15s %-20s %-20s %-15s %-15s%n", "Hora", "Voo", "Companhia",	"Origem", "Atraso", "Obs");
        for (Voos v : listaVoos) {
			info.println(v);
		}
		info.close();


        ////c)
        Map<String, int[]> atrasos = new HashMap<>();
        for (Voos v : listaVoos) {
			if (v.getAtraso() != "") {
				int[] late;
				if (atrasos.containsKey(v.getCompanhia().substring(0, 2).trim())) {
					late = atrasos.get(v.getCompanhia().substring(0, 2).trim());
				} else {
					late = new int[2];
				}
				late[0]++;
				late[1] += Voos.stringToMinutos(v.getAtraso());
				atrasos.put(v.getCompanhia().substring(0, 2).trim(), late);
			}
		}

        Map<String, Integer> atrasosTable = new HashMap<>();
		for (String k : atrasos.keySet()) {
			int[] v = atrasos.get(k);
			atrasosTable.put(k, (int) v[1] / v[0]);
		}
		atrasosTable = ordenarValCrescente(atrasosTable);

        System.out.println("\n--------------------------------------------------------------------------------------------");
        System.out.printf("%10s | %-10s%n", "Companhia", "Atraso");
        for(String at: atrasosTable.keySet()){
            System.out.printf("%10s | %-1s min%n", at, atrasosTable.get(at));
        }

        ///d)
        Map<String, Integer> mapaVoos = new HashMap<>();

		for(Voos v : listaVoos){
			String origem = v.getlocal();
			int nVoo =0;
			if(!mapaVoos.containsKey(origem)){
				mapaVoos.put(origem, nVoo+1);
			}else{
				mapaVoos.put(origem, mapaVoos.get(origem) +1);
			}
		}

		mapaVoos = ordenarValCrescente(mapaVoos);
		mapaVoos = ordenarValDecrescente(mapaVoos);

		PrintWriter ficheiro = new PrintWriter(new File("src/Aula11/cidades.txt"));
		ficheiro.printf("%-20s %-15s\n", "Origem", "Voos");
		for (String k : mapaVoos.keySet()) {
			ficheiro.printf("%-20s %-15s\n", k, mapaVoos.get(k));
		}
		ficheiro.close();
        
	}
    private static Map<String, Integer> ordenarValCrescente(Map<String, Integer> map){
            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
	
	    return sortedMap;
    }
    private static Map<String, Integer> ordenarValDecrescente(Map<String, Integer> map){  
	  LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
	  map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

	  return reverseSortedMap;
	}
}
