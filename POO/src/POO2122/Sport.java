package POO2122;

public class Sport extends Activity{
    enum Modality {
        KAYAK,
        BIKE
    }
    private Modality modality;
    private static int preco = 30;

    public Sport(Modality modality, int participantes) {
        super(participantes);
        this.modality = modality;
    }



    public Modality getModality() {
        return this.modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "\t" + modality +
                " activity for " + participantes +
                " participantes";
    }


    @Override
    public int getCost() {
        return preco*participantes;
    }

}

