package Aula03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);
        System.out.print("Valor N: ");
        N = sc.nextInt();
        sc.close();

        for(int i = N; i>=0; i--){
            System.out.println(i);
        }

    }
}
