package Aula06;

public class Date {
    private int d,m,y;

    public Date(int d, int m, int y) {
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
    public int getDay(){
        return this.d;
    }
    public int getMonth(){
        return this.m;
    }
    public int getYear(){
        return this.y;
    }

    public static boolean isValidMonth(int m){
        if(m < 1 || m > 12){
            return false;
        }else{
            return true;
        }
    }
    public static int monthDays(int month, int year){
        int dia;
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;
            case 2:
                if(year%4 == 0){
                    if(year%100 == 0){
                        if(year%400 == 0){
                            dia = 29;
                        }else{
                            dia = 28;
                        }
                    }else{
                        dia = 29;
                    }
                }else{
                    dia = 28;
                }
                break;
            default:
                dia = 31;
        }
        return dia;
    }
    public static boolean isLeapYear(int year){
        boolean isLeap;
        if(year % 4 == 0){
            if( year % 100 == 0){
                if ( year % 400 == 0){
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }
    public static boolean valid(int day, int month, int year ){
        if(isValidMonth(month) && day >= 1 && year > 0 && day <= monthDays(month, year)){
            return true;
        }else{
            return false;
        }
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
		final int prime = 31;
		int result = 1;
		result = prime * result + y;
		result = prime * result + d;
		result = prime * result + m;
		return result;
	}
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (y != other.y)
			return false;
		if (d != other.d)
			return false;
		if (m != other.m)
			return false;
		return true;
	}
}

