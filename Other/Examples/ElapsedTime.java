package Other.Examples;

/**
 * Created by user on 04.04.2017.
 */
import java.util.*;
public class ElapsedTime {
    public int getDays(GregorianCalendar g1, GregorianCalendar g2) {
        int elapsed = 0;
        GregorianCalendar gc1, gc2;
        if (g2.after(g1)) {
            gc2 = (GregorianCalendar) g2.clone();
            gc1 = (GregorianCalendar) g1.clone();
        }
        else   {
            gc2 = (GregorianCalendar) g1.clone();
            gc1 = (GregorianCalendar) g2.clone();
        }
        gc1.clear(Calendar.MILLISECOND);
        gc1.clear(Calendar.SECOND);
        gc1.clear(Calendar.MINUTE);
        gc1.clear(Calendar.HOUR_OF_DAY);
        gc2.clear(Calendar.MILLISECOND);
        gc2.clear(Calendar.SECOND);
        gc2.clear(Calendar.MINUTE);
        gc2.clear(Calendar.HOUR_OF_DAY);
        while ( gc1.before(gc2) ) {
            gc1.add(Calendar.DATE, 1);
            elapsed++;
        }
        return elapsed;
    }
    public int getMonths(GregorianCalendar g1, GregorianCalendar g2) {
        int elapsed = 0;
        GregorianCalendar gc1, gc2;
        if (g2.after(g1)) {
            gc2 = (GregorianCalendar) g2.clone();
            gc1 = (GregorianCalendar) g1.clone();
        }
        else   {
            gc2 = (GregorianCalendar) g1.clone();
            gc1 = (GregorianCalendar) g2.clone();
        }
        gc1.clear(Calendar.MILLISECOND);
        gc1.clear(Calendar.SECOND);
        gc1.clear(Calendar.MINUTE);
        gc1.clear(Calendar.HOUR_OF_DAY);
        gc1.clear(Calendar.DATE);
        gc2.clear(Calendar.MILLISECOND);
        gc2.clear(Calendar.SECOND);
        gc2.clear(Calendar.MINUTE);
        gc2.clear(Calendar.HOUR_OF_DAY);
        gc2.clear(Calendar.DATE);
        while ( gc1.before(gc2) ) {
            gc1.add(Calendar.MONTH, 1);
            elapsed++;
        }
        return elapsed;
    }
    public int getYears(GregorianCalendar g1, GregorianCalendar g2) {
        int elapsed = 0;
        GregorianCalendar gc1, gc2;
        if (g2.after(g1)) {
            gc2 = (GregorianCalendar) g2.clone();
            gc1 = (GregorianCalendar) g1.clone();
        }
        else   {
            gc2 = (GregorianCalendar) g1.clone();
            gc1 = (GregorianCalendar) g2.clone();
        }
        gc1.clear(Calendar.MILLISECOND);
        gc1.clear(Calendar.SECOND);
        gc1.clear(Calendar.MINUTE);
        gc1.clear(Calendar.HOUR_OF_DAY);
        gc1.clear(Calendar.DATE);
        gc2.clear(Calendar.MILLISECOND);
        gc2.clear(Calendar.SECOND);
        gc2.clear(Calendar.MINUTE);
        gc2.clear(Calendar.HOUR_OF_DAY);
        gc2.clear(Calendar.DATE);
        gc2.clear(Calendar.MONTH);
        while ( gc1.before(gc2) ) {
            gc1.add(Calendar.YEAR, 1);
            elapsed++;
        }
        return elapsed;
    }
    public static void main(String[] args) {
        GregorianCalendar gc1 = new GregorianCalendar(1981, Calendar.APRIL, 15);
        GregorianCalendar gc2 = new GregorianCalendar(2017, Calendar.MARCH, 4);
        ElapsedTime et = new ElapsedTime();
        int days = et.getDays(gc1, gc2);
        int months = et.getMonths(gc1, gc2);
        int years = et.getYears(gc1, gc2);
        System.out.println("Days = " + days);
        System.out.println("Months = " + months);
        System.out.println("Years = " + years);
    }
}