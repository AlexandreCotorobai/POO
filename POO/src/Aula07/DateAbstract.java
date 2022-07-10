package Aula07;

public abstract class DateAbstract implements Comparable<DateAbstract>{
    // abstract int getYear();
    // abstract int getMonth();
    // abstract int getDay();
    abstract void decrement();
    abstract void increment();
    public static boolean isValidMonth(int m){
        if(m < 1 || m > 12){
            return false;
        }else{
            return true;
        }
    }

    public int daysCount(int d, int m, int y){
        int daysCount = 0;
        for(int i = 2000; i<y; i++){
            if(isLeapYear(i)){
                daysCount += 366;
            }else{
                daysCount += 365;
            }
        }
        for(int j = 1; j < m; j++){
            daysCount += monthDays(j, y);
        }
        daysCount += d;
        return daysCount;
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
}
