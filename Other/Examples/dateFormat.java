package Other.Examples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import static java.lang.String.format;

public class dateFormat {
    public static void main(String[] args) {
        Date aDate = new Date();
        System.out.println(aDate);
        System.out.println(format("%tc", aDate));
        System.out.println(format("%tr", aDate));
        System.out.println(format("%tA, %td %tB",aDate,aDate,aDate));
        System.out.println(format("%tA, %<td %<tB",aDate));


        System.out.println();

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = new GregorianCalendar();
        //date1.set(2004,0,7,15,40);
        System.out.println(date1.getTime());
        //System.out.println(date2.getTime());
        //System.out.println(format());
        date1.add(date1.DATE,32);
        //System.out.println(date1.DATE);
        //date1.roll(date1.DATE,35);
        //System.out.println(date1.getTime());
        //System.out.println(date2.getTime());
       // date1.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(date1.getTime());

    }
}
