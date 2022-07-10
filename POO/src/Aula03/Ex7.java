package Aula03;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int guess = -1;
        int number;
        int count = 0;
        boolean continuar = true;
        String ler;
        Scanner sc = new Scanner(System.in);

        do{
            number = (int)(Math.random()*100 + 1);
            System.out.println("SECRET: "+ number);
            

            while(true){
                System.out.print("Your guess: ");
                guess = sc.nextInt();
                count += 1;

                if(guess < 1 || guess > 100){
                    System.out.println("Number out of range!");
                }else if(guess < number){
                    System.out.println("Demasiado Baixo!");
                }else if(guess > number){
                    System.out.println("Demasiado Alto!");
                }else{
                    System.out.println("ACERTOU! \nNr de tentativas: "+ count);
                    break;
                }
            }
            
            System.out.print("\nDeseja continuar? Prima (S)im  ");
            ler = sc.next().toLowerCase();

            if(ler.equals("s") || ler.equals("sim")){
                continuar = true;
                count = 0;
            }else{
                continuar = false;
            }
        }while(continuar);
        sc.close();

        System.out.println("Programa terminado!");

    }
}
