package Other.javabuddy.hw;

import java.util.Scanner;

/**
 * Created by user on 05.02.2017.
 */
public class test1 {
/*
    int setData(int coordLimit) {
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while (x){
            int xy = sc.nextInt();
            if (xy < coordLimit+1){
                System.out.println("It's ok!");
                x = false;
                return xy;

                //break;
            } else {
                System.out.println("Try again");
            }

        }




       // System.out.println(xy);
       return 0;

    }
 */
    void reduction (int a, int b){
        double newA=0, newB=0;
        for (int i = Math.min(a,b); i > 1; i--){
            if (a%i == 0 & b%i == 0){
                newA = a/i;
                newB = b/i;
                System.out.println(i + " " + newA + " " + newB);
                break;
            } else {
                newA = a;
                newB = b;
                System.out.println(newA + " " + newB);
            }
            /*
            newA = a/i;
            System.out.println(newA);
            newA = a%i;
            System.out.println(newA);
            */
        }
        System.out.println(newA +"/"+ newB);
    }
}

class test1test {
    public static void main(String[] args) {
        /*
        int x;
        int coordLimit = 7;
        test1 t = new test1();
        x=t.setData(coordLimit);
        System.out.println("Summary data is " + x);*/
        test1 t = new test1();
        t.reduction(16,16);

        int a = -17;
        int b = 6;
        System.out.println("rzult " + a +"/" + b);

        if (Math.abs(a) > b){
            System.out.println(a/b + " " + Math.abs(a%b) + "/" + b);


        }


    }
}