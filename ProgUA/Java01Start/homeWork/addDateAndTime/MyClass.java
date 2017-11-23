package ProgUA.Java01Start.homeWork.addDateAndTime;
import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        Date dt1 = new Date(2017-1900,10,23);
        System.out.println(dt1);

        long ctm = System.currentTimeMillis();
        System.out.println(ctm);
        Date dt2 = new Date(ctm);
        System.out.println(dt2);

        System.out.println(dt1.equals(dt2));
        System.out.println(dt1.compareTo(dt2));
        System.out.println(dt2.compareTo(dt1));
    }
}
