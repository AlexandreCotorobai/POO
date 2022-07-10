package Aula07;

public class DateYMD extends DateAbstract{
    private int d,m,y;

    public DateYMD(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
        if (!valid(d, m, y)) {
            throw new IllegalArgumentException("Data invalida");
        }
	}

    public void set(int d, int m, int y) {
		if (valid(d, m, y)) {
            this.d = d;
            this.m = m;
            this.y = y;
        } else {
            System.out.println("Invalid date");
        }
    }

    public int getDays(){
        return daysCount(d, m, y);
    }
    public int getDay(){
        return this.d;
    }
    public int getMonth(){
        return this.m;
    }
    public int getYear(){
        return this.y;
    }

    public void increment() {
        this.d += 1;
        if (this.d > monthDays(m, y)) {
            this.d = 1;
            this.m += 1;
            if (this.m > 12) {
                this.m = 1;
                this.y += 1;
            }
        }
    }
    public void decrement() {
        this.d -= 1;
        if (this.d < 1) {
            if (this.m - 1 < 1) {
                this.d = monthDays(12, y - 1);
                this.m = 12;
                this.y = y - 1;
            } else {
                this.m -= 1;
                this.d = monthDays(m, y);
            }
        }
    }
    @Override
    public String toString() {
        return d + "-" + m + "-" + y;
    }
    @Override
	public int hashCode() {
		return daysCount(d, m, y);
	}
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() == obj.getClass()){
            return this.getDays() == ((DateYMD) obj).getDays();
        }else if(obj instanceof DateAbstract){
            return this.getDays() == ((DateND) obj).getDays();
        }else{
            return false;
        }
	}
    public int compareTo(DateAbstract o){
        return this.hashCode() == o.hashCode() ? 0 : this.getDays() > o.hashCode() ? 1 : -1;
    }
}