package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("src/Aula10/words.txt"));

        ArrayList<String> palavras2char = new ArrayList<>();
        ArrayList<String> acabas = new ArrayList<>();
        

        while (input.hasNext()) {
            String word = input.next();
            // System.out.println(word);
            if(word.length()>2) {
				palavras2char.add(word);
			}
        }
        System.out.println("Palavras +2 chars: "+palavras2char);

        for(String i : palavras2char){
            
            if(i.toLowerCase().endsWith("s")) {
				acabas.add(i);
                // System.out.println(i);
			}
        }
        System.out.println("\nPalavras acabadas em s: "+ acabas);


        for(int i = 0; i<palavras2char.size(); i++){
            boolean remove = false;
            for(int j = 0; j<palavras2char.get(i).length(); j++){
                if(!Character.isLetter(palavras2char.get(i).charAt(j)) || Character.isDigit(palavras2char.get(i).charAt(j))){
                    remove = true;
                    
                    break;
                }  
            }
            if(remove){
                palavras2char.remove(palavras2char.get(i));
                i--;
            }
        }

        System.out.println("\nPalavras que apenas contem letras: "+ palavras2char); //No meu words.txt tem palavras com virgulas e pontos la no meio, daí essas nao aparecerem

    }
}
