package Other.javabuddy.hw;

import java.util.Scanner;

/**
 * Created by user on 31.01.2017.
 */
public class inchToMetrical {
    public static void main(String[] args) {
        //double gallon, litres;
        int counter;

        Scanner sc = new Scanner(System.in);
        int i ,inch = sc.nextInt();


        counter= 0;
        for (i =1; i <=inch; i++){
            //litres = gallon*3.7854;
            System.out.println(i + " inches = " + toMetre(i) + " metres");
            counter++;
            if (counter ==12){
                System.out.println("");
                counter=0;
            }
        }



    }
    public static double toMetre (double inch){
        double x=inch*0.0254;
        return x;
    }
}
