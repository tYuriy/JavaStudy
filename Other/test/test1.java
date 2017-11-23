package Other.test;

import sun.applet.Main;

import java.util.*;
import java.io.*;

import static java.lang.String.format;


/**
 * Created by user on 09.02.2017.
 */
public class test1 {
    public static void main(String[] args)    {
        int i = 1;
        i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
        System.out.println(i);
        i = 2;
        i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
        System.out.println(i);

        int a = 88888;
        a+=++a;
        System.out.println(a);
        short x =3;
        byte b = 2;
        double k = 5.0;
        k=a;
        //x=k;
        //b=x;
        x=b;

        System.out.println(format("%,.2f",123456789.0));
        System.out.println(format("%c", 38));
        System.out.println(format("%x", 32000));
        System.out.println(format("%,6.1f", 42.000));





































    }
}


