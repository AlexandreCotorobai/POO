package Miniteste;

import java.util.List;

import Aula05.Date;

import java.util.ArrayList;
import java.io.IOException;

public class RandomMealTester{
    public static void main(String[] args) throws IOException{
        Restaurante rest = new Restaurante();

        List<Cliente> r = new ArrayList<Cliente>();
        r.add(new Cliente("Joao", new Date(1, 1, 2000), "Rua A", 111111111));
        r.add(new Cliente("Carlos", new Date(1, 10, 2003), "Rua B", 222222222));
        r.add(new Cliente("Marta", new Date(31, 3, 2002), "Rua C", 333333333));
        r.add(new Cliente("Ricardo", new Date(14, 7, 2000), "Rua D", 444444444));
        r.add(new Cliente("Paula", new Date(3, 6, 2001), "Rua E", 555555555));

        // selecionar aleatoriamente cliente, que receberá um prato do menu aleatório
        // os pratos disponíveis estão listados no ficheiro "menu.csv", no formado: nomeDoPrato;preço(€);calorias(kcal)
        for (int i=0; i<40; i++) {
            int ri = (int) (Math.random()*r.size());
            rest.pedirPratoAleatorio(r.get(ri));
        }

        rest.listarPratosEClientes();
        rest.imprimirPratoMaisConsumido();
    }
}