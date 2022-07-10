package Aula12;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(new FileReader("src/Aula11/words.txt", StandardCharsets.UTF_8));
        input.useDelimiter("[\\p{Punct}\\s]");

        TreeSet<String> palavras = new TreeSet<String>();
        int total = 0;
        int diferentes = 0;

        while (input.hasNext()) {
            String word = input.next();
            if(word.length()>2) {
                total++;
                if(!palavras.contains(word)) {
                    palavras.add(word);
                    diferentes++;;
                }else{
                    System.out.println("Palavra repetida: "+word);
                }
				//System.out.println(word);
			}
        }

        input.close();
        System.out.println("Total de palavras: " + total);
        System.out.println("Total de palavras diferentes: " + diferentes);
        
        System.out.println("Total de palavras diferentes: " + palavras.size());
    }
    
}
