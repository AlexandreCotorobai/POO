package Aula04;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] data = lervalores();
        int diadomes = calculoDiaMes(data);
        calendario(data, diadomes);
    }


    public static int[] lervalores(){
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];

        do{
            System.out.print("Insira mes (1-12): ");
            data[0] = sc.nextInt();
            System.out.print("Insira ano: ");
            data[1] = sc.nextInt();
            System.out.print("Dia da semana que começa (1-7): ");
            data[2] = sc.nextInt();
        }while(data[0] < 1 || data[0] > 12 || data[1] <= 0 || data[2] < 1 || data[2] > 7);

        sc.close();

        return data;
    }
    public static int calculoDiaMes(int[] data){
        int dia;

        switch(data[0]){
            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;
            case 2:
                if(data[1]%4 == 0){
                    if(data[1]%100 == 0){
                        if(data[1]%400 == 0){
                            dia = 29;
                        }else{
                            dia = 28;
                        }
                    }else{
                        dia = 29;
                    }
                }else{
                    dia = 28;
                }
                break;
            default:
                dia = 31;
        }
        return dia;
    }
    public static void calendario(int[] data, int nrDias){
        String[] listameses = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int mes = data[0];
        int ano = data[1];
        int dsemana = data[2];
        int count;
        String cabecalign = "";
        String cabecalho = listameses[mes-1] +" " + ano;
        int center = (" Su Mo Tu We Th Fr Sa".length() - cabecalho.length())/2;
        

        for(int i = 0; i < center; i++){
            cabecalign += " ";
        }
        cabecalign += cabecalho;

        System.out.printf("\n\n%s\n", cabecalign);;
        System.out.println(" Su Mo Tu We Th Fr Sa");


        if(dsemana == 7){
            dsemana = 0;
        }

        count = dsemana;

        for(int i = 0; i < dsemana; i++){
            System.out.printf("%3s", "");
        }

        for(int i = 1; i <= nrDias; i++){
            System.out.printf("%3s", i);
            count++;
            if(count >= 7){
                count = 0;
                System.out.println();
            }
        }


    }
}
