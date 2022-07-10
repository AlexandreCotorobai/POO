package Aula04;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        String frase;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzir frase: ");
        frase = sc.nextLine();
        sc.close();

        System.out.println("Numero de digitos: " + countDigits(frase));
        System.out.println("Numero de espaços: " + countSpaces(frase));
        System.out.println("Frase em minusculas? " + isLower(frase));
        System.out.println("Frase sem espaços repetidos: " + rowSpaces(frase));
        System.out.println("Palindromo? " + isPalindromo(frase));
    }

    public static int countDigits(String s){
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static int countSpaces(String s){
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static boolean isLower(String s){
        boolean lower = false;

        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
               lower = true;
            }else{
                lower = false;
                return lower;
            }
        }
        return lower;
    }
    public static String rowSpaces(String s){
        String newstring = String.valueOf(s.charAt(0));

        for(int i = 1; i<s.length(); i++){
            if(Character.isSpaceChar(s.charAt(i)) && Character.isSpaceChar(s.charAt(i-1))){
                newstring += "";
            }else{
                newstring += s.charAt(i);
            }
        }
        return newstring;

    }
    public static boolean isPalindromo(String s){
        char frente, tras;
        boolean palindromo = true; //considerei uma palavra de um caractere como sendo um palindromo

        for(int i = 0; i<s.length()/2; i++){
            frente = s.charAt(i);
            tras = s.charAt(s.length()-1-i);

            if(frente == tras){
                palindromo = true;
            }else{
                palindromo = false;
            }
        }

        return palindromo;
    }
}
