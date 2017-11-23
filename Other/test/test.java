package Other.test;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.lang.String;
import java.util.Scanner;


/**
 * Created by user on 09.02.2017.
 */
public class test {
    static class Bread {
        int x;

        void printData() {
            System.out.println("wutsuuuuuup!!!" + x);
        }
        public int calc (int a, int b){
            return a*b;
        }
    }
    public static void main(String[] args) {
        int x = 0;
        x++;
        System.out.println(++x);

        ID_andCounter l = new ID_andCounter();
        System.out.println(l.id);
        System.out.println(ID_andCounter.counter);
        //int xx = ;
        System.out.println(Math.round(-24.4));
        System.out.println(Math.round(-24.5f));
        System.out.println(Math.round(-24.6F));
        System.out.println(Math.round(24.4));
        System.out.println(Math.round(24.5));
        System.out.println(Math.round(24.6));
    }
    /*public void takeRisk () throws BadException {
        if (abandonAllHope){
            throw new BadException();
        }
    }*/

}
