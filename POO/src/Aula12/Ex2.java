package Aula12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class Ex2 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(new FileReader("src/Aula12/movies.txt", StandardCharsets.UTF_8));
        
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Set<String> genres = new HashSet<String>();

        input.nextLine();
        while (input.hasNext()) {
            String[] word = input.nextLine().trim().split("\t");
            movies.add(new Movie(word[0], Double.parseDouble(word[1]), word[2], word[3], Integer.parseInt(word[4])));
            genres.add(word[3]);
        }

        input.close();

        System.out.println("Ordenado por name----------------------------------------------------");
        movies.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
		

        for(Movie m:movies){
            System.out.println(m);
        }

        System.out.println("\n\nOrdenado por Score----------------------------------------------------");

        movies.sort((a, b) -> Double.compare(a.getScore(),b.getScore()));
		Collections.reverse(movies);

        for(Movie m:movies){
            System.out.println(m);
        }

        System.out.println("\n\nOrdenado por Rtime----------------------------------------------------");

        movies.sort((a, b) -> Integer.compare(a.getRtime(),b.getRtime()));

        for(Movie m:movies){
            System.out.println(m);
        }

        System.out.println("\n\nPrint Generos----------------------------------------------------");
        for(String s: genres){
            System.out.println(s);
        }

        PrintWriter ficheiro = new PrintWriter(new File("src/Aula12/myselection.txt"));
		ficheiro.printf("%-30s %-5s %-10s %-10s %-5s%n", "name", "score", "rating", "genre", "rtime");
        for (Movie m : movies) {
            if(m.getScore()>60 && m.getGenre().equals("comedy")){
                ficheiro.println(m);
            }
		}
		ficheiro.close();
    }
}
