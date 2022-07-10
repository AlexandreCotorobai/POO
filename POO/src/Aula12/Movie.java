package Aula12;


public class Movie {
    String name;
    double score;
    String rating, genre;
    int rtime;

    public Movie(String name, double score, String rating, String genre, int rtime) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.rtime = rtime;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRtime() {
        return rtime;
    }

    public void setRtime(int rtime) {
        this.rtime = rtime;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-5s %-10s %-10s %-5s", name, score, rating, genre, rtime);
    }
}
