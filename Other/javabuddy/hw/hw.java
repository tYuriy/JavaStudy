package Other.javabuddy.hw;

//import java.io.*;
//import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Created by user on 30.01.2017.
 */
public class hw {

    public static void main(String[] args) /*throws Exception*/ {

        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();

        System.out.println(aMoon(i));

    }
    public static double aMoon(double anEarth){
        double x= anEarth*0.17;
        return x;
    }

}


