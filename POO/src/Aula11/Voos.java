package Aula11;

import java.util.*;


public class Voos {
    private String hora, companhia, local, atraso, obs;
    private static Map<String,String> sigCompanhia;


    public Voos(String hora, String companhia, String local, String atraso) {
        this.hora = hora;
        this.companhia = companhia;
        this.local = local;
        this.atraso = atraso;
        this.obs = horaPrev(hora, atraso);

    }
    public Voos(String hora, String companhia, String local){
        this.hora = hora;
        this.companhia = companhia;
        this.local = local;
        this.atraso = "";
        this.obs = "";
    }

    public String getCompanhia(){
        return this.companhia;
    }
    public String getlocal(){
        return this.local;
    }
    
    public String getAtraso(){
        return this.atraso;
    }

    public static void setCompanhias(Map<String,String> sigla){
        sigCompanhia = sigla;
    }


    public String horaPrev(String previsto, String atraso){
        String[] hora1 = previsto.split(":");
        String[] hora2 = atraso.split(":");
        int horas = Integer.parseInt(hora1[0]) + Integer.parseInt(hora2[0]);
        int minutos = Integer.parseInt(hora1[1]) + Integer.parseInt(hora2[1]);
        do{
            if(minutos>=60){
                minutos -= 60;
                horas++;
            }
            if(horas > 23){
                horas = 00;
            }
        }while(minutos>=60);
        
        return String.format("%02d:%02d", horas, minutos);
    }

    public static int stringToMinutos (String s) {
		String[] hm = s.split(":");
		int minutos = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);
		return minutos;
	}

    @Override
	public String toString() {
		if (atraso.contentEquals("")) {
			return String.format("%-15s %-15s %-20s %-20s", hora, companhia,sigCompanhia.get(companhia.substring(0,2).trim()), local);
		} else {
			return String.format("%-15s %-15s %-20s %-20s     %-15s %-15s", hora, companhia, sigCompanhia.get(companhia.substring(0,2).trim()), local, atraso, "Previsto: "+ obs);
		}
	}
}