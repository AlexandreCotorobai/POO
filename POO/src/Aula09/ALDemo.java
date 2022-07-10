package Aula09;

import java.util.*;
import Aula06.Date;
import Aula06.Pessoa;
import Aula07.DateAbstract;
import Aula07.DateND;
import Aula07.DateYMD;

public class ALDemo{
    public static void main(String[] args) {
        ArrayList<Integer> c1= new ArrayList<>();
        for(int i= 10; i<= 100; i+=10){
            c1.add(i);
        }

        System.out.println("Size: "+ c1.size());
        for(int i= 0; i< c1.size(); i++){
            System.out.println("Elemento: "+ c1.get(i));
        }

        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        System.out.println(c1.get(0)); 
        System.out.println(c1.contains(20));
        System.out.println(c1.size());
        System.out.println("--Para c2--");   
        System.out.println(c2.get(0));
        System.out.println(c2.contains("Chuva"));
        System.out.println(c2.contains("Ar"));
        System.out.println();        

        System.out.println(c1.indexOf(20));
        System.out.println(c1.subList(3, 5));
        System.out.println((c1.set(0, 3)));
        System.out.println(c1);

        Set<Pessoa> c3 = new HashSet<>();
        Pessoa t = new Pessoa("Vos", 9991299, new Date(23, 9, 1920));
        Pessoa t2 = new Pessoa("Vos", 9991299, new Date(23, 9, 1920));
        c3.add(new Pessoa("Eu", 9999999, new Date(18, 7, 1910)));
        c3.add(new Pessoa("Tu", 9999999, new Date(23, 1, 1920)));
        c3.add(new Pessoa("Ele", 7777777, new Date(23, 2, 1920)));
        c3.add(new Pessoa("Nos", 9239999, new Date(13, 1, 1920)));
        c3.add(t);
        c3.add(t2);

        System.out.println(c3);
        System.out.println(t.hashCode());
        System.out.println(t2.hashCode());

        Iterator<Pessoa> iterator = c3.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("AQUI---------------------------------------------");;
        Set<DateAbstract> c4 = new TreeSet<>();

        c4.add(new DateYMD(18, 7, 2910));
        c4.add(new DateYMD(19, 7, 2310));
        c4.add(new DateND(1, 1, 2000));
        c4.add(new DateND(1, 2, 2310));
        c4.add(new DateND(3, 1, 2000));
        c4.add(new DateND(19, 7, 2310));

        System.out.println(c4);
        Iterator<DateAbstract> iterator2 = c4.iterator();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        //NAO TEM LOGICA
        DateAbstract a = new DateND(19, 7, 2310);
        DateAbstract b = new DateYMD(19, 7, 2310);
        System.out.println(b.equals(a));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
