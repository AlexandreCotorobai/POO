package POO2122;

public abstract class Activity{
    protected int participantes;

    public Activity(int participantes) {
        this.participantes = participantes;
    }

    public abstract int getCost();

    // public abstract String toString();


    public int getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public abstract String toString();
}
