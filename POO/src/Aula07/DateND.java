package Aula07;

public class DateND extends DateAbstract {
    int days = 0;

    // Muito sinceramente pouco percebi desta alinea, deixei a classe a dar
    // print ao numero de dias após 1.1.2000 e as funcoes de incremente e
    // decremento funcionais
    public DateND(int d, int m, int y) {
        if (valid(d, m, y)) {
            this.days = daysCount(d, m, y);
        }
	}

    private String getYMD(int days){
        int d = 1;
        int m = 1;
        int y = 2000;
        while(days != daysCount(d, m, y)){
                if(d == monthDays(m, y)){
                    d = 1;
                    m++;
                }else{
                    d++;
                }
                if(m == 13){
                    m = 1;
                    y++;
                }
        }
       return d + "-" + m + "-" + y; 
    }

    public int getDays(){
        return days;
    }
    public void increment() {
        this.days++;
    }
    public void decrement() {
        this.days--;
    }
    @Override
    public String toString() {
        return getYMD(days);
    }

    @Override
	public int hashCode() {
		return days;
	}
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() == obj.getClass()){
            return this.days == ((DateND) obj).getDays();
        }else if(obj instanceof DateAbstract){
            return this.days == ((DateYMD) obj).getDays();
        }else{
            return false;
        }
	}
    public int compareTo(DateAbstract o){
        return this.hashCode() == o.hashCode() ? 0 : this.days > o.hashCode() ? 1 : -1;
    }
}

