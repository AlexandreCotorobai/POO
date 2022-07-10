package Aula03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int N;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Indique numero: ");
            N = sc.nextInt();
        }while(N <= 0);

        sc.close();

        if (N == 1){
            primo = false;
        }else{
            for (int i = 2; i < N; i++){
                if (N%i == 0){
                    primo = false;
                    break;
                }else{
                    primo = true;
                }
            }   
        }
        System.out.println("Primo? " + primo);
    }

}
