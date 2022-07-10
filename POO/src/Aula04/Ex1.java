package Aula04;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        String frase;
        String comparar = "ab";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzir frase: ");
        frase = sc.nextLine();
        sc.close();

        System.out.println("To lower case: " + frase.toLowerCase());

        System.out.println("Last char: " + frase.charAt(frase.length()-1));

        System.out.println("Subtring, first 3: " + frase.substring(0,3));


        System.out.println("String equals to ab: " + frase.equals(comparar));
        System.out.println("String replace: " + frase.replace("n", "b"));
        System.out.println("String starts with: " + frase.startsWith("b"));

    }
}
