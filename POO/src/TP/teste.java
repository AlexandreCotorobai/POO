package TP;

public class teste {
    public static void main(String[] args){
        // String data = " feve" + "reiro ";
        // data = 10 + data;
        // data += "de " + 2019;
        // System.out.println(data);

        // StringBuilder sb = new StringBuilder();
        // sb.append(10);
        // sb.append(" feve");
        // sb.append("reiro ");
        // sb.append("de ");
        // sb.append(2019);
        // System.out.println(sb);
        // String data = sb.toString();
        // System.out.println(data);

        // String s1 = "Aveiro";
        // String s2 = "aveiro";
        // System.out.println(s1.equals(s2) ? "Iguais" : " Diferentes");
        // System.out.println(s1.equalsIgnoreCase(s2) ? "Iguais" : " Diferentes ");
        // System.out.println(s1.compareTo(s2)); 

        ///Ver o string format
            String x = "1-de-janeiro-2017";
            int n = 0, p;
            for(p = 0 ; p < x.length() ; p++){
            if(Character.isDigit(x.charAt(p))){
            n++;
            }
            }
            System.out.println("n=" + n);
            System.out.println("p=" + p);
            String y[] = x.split("-");
            System.out.println(y.length);
            for(String s : y){
            System.out.print(s);
            }
            System.out.println();
        
    }
}
    
