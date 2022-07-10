package Aula04;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String acron = "";
        String frase;
        String[] palavras;

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        frase = sc.nextLine();

        sc.close();

        palavras = frase.split(" ");

        for(int i = 0; i < palavras.length; i++){
            if(palavras[i].length() > 3){
                acron += palavras[i].charAt(0);
            }
        }
        System.out.println(acron.toUpperCase());
    }
}
