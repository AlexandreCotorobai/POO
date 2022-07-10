package Aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int ss, hh, mm;

        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo (s): ");
        ss = sc.nextInt();
        sc.close();
        hh = ss / 3600;
        ss -= 3600*hh;
        mm = ss / 60;
        ss -= 60*mm; 
        System.out.println(hh+":"+mm+":"+ss);
    }
}
