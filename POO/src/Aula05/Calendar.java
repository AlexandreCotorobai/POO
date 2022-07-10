package Aula05;


public class Calendar {
    private int dsemana, year;

    public Calendar() {
    }

    public Calendar(int dsemana, int year) {
        if (dsemana < 1 || dsemana > 7) {
            throw new IllegalArgumentException("Data invalida");
        }
        this.dsemana = dsemana;
        this.year = year;
    }

    public int getWeekDay() {
        return this.dsemana;
    }

    public int getYear() {
        return this.year;
    }

    public int firstWeekdayOfMonth(int mes) {
        int days = getWeekDay();
        for (int i = 1; i < mes; i++) {
            days += Date.monthDays(i, year);
        }
        days = days % 7;
        return days;
    }

    public void printMonth(int mes) {
        int count = 0;
        String[] listameses = new String[] { "January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December" };
        String cabecalign = "";
        String cabecalho = listameses[mes-1] +" " + year;
        int center = (" Su Mo Tu We Th Fr Sa".length() - cabecalho.length())/2;
    

        for(int j = 0; j < center; j++){
            cabecalign += " ";
        }
        cabecalign += cabecalho;
        
        System.out.printf("%s\n", cabecalign);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        if(dsemana == 7){
            dsemana = 0;
        }

        count = dsemana;

        for(int i = 0; i < dsemana; i++){
            System.out.printf("%3s", "");
        }

        for(int i = 1; i <= Date.monthDays(mes-1, year); i++){
            System.out.printf("%3s", i);
            count++;
            if(count >= 7){
                count = 0;
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        String iguess = "";
        for (int i = 1; i <= 12; i++) {
            String[] listameses = new String[] { "January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December" };
            String cabecalign = "";
            String cabecalho = listameses[i-1] +" " + year;
            int center = (" Su Mo Tu We Th Fr Sa".length() - cabecalho.length())/2;
        

            for(int j = 0; j < center; j++){
                cabecalign += " ";
            }
            cabecalign += cabecalho;
            
            System.out.printf("%s\n", cabecalign);
            System.out.println(" Su Mo Tu We Th Fr Sa");
            int firstdayofmonth = firstWeekdayOfMonth(i);
            int tracker = firstdayofmonth;
            System.out.print("   ".repeat(firstdayofmonth));
            for (int j = 1; j <= Date.monthDays(i, year)-1; j++) {
                if (tracker == 6) {
                    System.out.printf("%3s\n", j);
                    tracker = 0;
                } else {
                    System.out.printf("%3s", j);
                    tracker += 1;
                }
            }
            System.out.printf("%3s\n", Date.monthDays(i, year));
        }
        return iguess;
    }
}