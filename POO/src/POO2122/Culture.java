package POO2122;

public class Culture extends Activity{
    enum Option {
        WINE_TASTING,
        RIVER_TOUR,
        ARCHITECTURAL_TOUR
    }

    private Option option;
    private static int preco = 25;

    public Culture(Option option, int participantes) {
        super(participantes);
        this.option = option;
    }



    public Option getOption() {
        return this.option;
    }

    public void setOption(Option option) {
        this.option = option;
    }


    @Override
    public String toString() {
        return "\t" + option +
                " activity for " + participantes +
                " participantes";
    }

    @Override
    public int getCost() {
        return preco*participantes;
    }
}
