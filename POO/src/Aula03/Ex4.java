package Aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        double media, maior, menor, N, first;
        double soma = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique numero: ");
        first = maior = menor = sc.nextDouble();

        do{
            System.out.print("Indique numero: ");
            N = sc.nextDouble();
            if(N>maior){
                maior = N;
            }else{
                menor = N;
            }
            soma += N;
            count++;
        }while(first != N);
        sc.close();
        media = soma/count;

        System.out.println("Valor minimo: " + menor);
        System.out.println("Valor maximo: " + maior);
        System.out.println("Média: " + media);
        System.out.println("Numero total de numeros introduzidos: " + count);

    }
}
