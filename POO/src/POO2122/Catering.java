package POO2122;

public class Catering extends Activity{
    enum Option {
        FULL_MENU,
        DRINKS_AND_SNACKS,
        LIGHT_BITES
    }

    private Option option;
    private static int preco = 35;

    public Catering(Option option, int participantes) {
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
