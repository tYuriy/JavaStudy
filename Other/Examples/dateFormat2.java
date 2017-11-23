package Other.Examples;

import java.util.*;

/**
 * Created by user on 03.04.2017.
 */
public class dateFormat2 {

    public static void main(String[] args) {
        //System.out.println(Calendar.getInstance());

        Calendar date1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        Calendar date2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println("date1 = " + date1.getTime());
        System.out.println("date2 = " + date2.getTime()+"\n");

        date1.set(date1.get(Calendar.YEAR),date1.get(Calendar.MONTH),date1.get(Calendar.DAY_OF_MONTH),0,0,0);
        date2.set(2004,2,19,0,0,0);

        System.out.println("date1 = " + date1.getTime());
        System.out.println("date2 = " + date2.getTime());
        System.out.println();

        long day1= date1.getTime().getTime();
        long day2= date2.getTime().getTime();
        long dayDiff = day1-day2;

        Calendar newDiff = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        newDiff.setTime(new Date(dayDiff));

        newDiff.add(Calendar.SECOND,1);

        newDiff.add(Calendar.YEAR,-1970);
        System.out.println("newDiff = " + newDiff.getTime());

        System.out.println(newDiff.get(Calendar.YEAR)+" years, " +
                           newDiff.get(Calendar.MONTH)+" month, " +
                           newDiff.get(Calendar.DAY_OF_MONTH)+ " days, " +
                           newDiff.get(Calendar.HOUR_OF_DAY)+ " hours, "+
                           newDiff.get(Calendar.MINUTE)+ " minutes, "+
                           newDiff.get(Calendar.SECOND)+ " sec");

        date2.set(Calendar.YEAR,2014);
        System.out.println("\nnew date2 = " + date2.getTime());
    }
}
