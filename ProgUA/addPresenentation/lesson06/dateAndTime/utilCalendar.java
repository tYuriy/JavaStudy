package ProgUA.addPresenentation.lesson06.dateAndTime;

import java.util.Calendar;
import java.util.Date;

public class utilCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));

        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, -2);
        c.add(Calendar.DAY_OF_MONTH, -2);

        Date dt = c.getTime();
        System.out.println(dt);
    }
}

