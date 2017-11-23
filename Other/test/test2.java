package Other.test;

/**
 * Created by superUser on 08.08.2017.
 * ax2+bx+c=0
 */
public class test2 {

    public static void main(String[] args) {
        double a = 0;
        double b = 10;
        double c = 0;

        //PUT YOUR CODE HERE
        double d;
        d = b*b-4*a*c;

        //System.out.println(d);
        //if (a=0 & b <>0){}


        double x1 = (a!=0)?((-b+Math.sqrt(d))/(2*a)):(-c/b);
        double x2 = (a!=0)?((-b-Math.sqrt(d))/(2*a)):(-c/b);

        System.out.println("x1=" + (d>=0?x1:""));
        System.out.println("x2=" + (d>=0?x2:""));
        //PUT YOUR CODE HERE
    }
}
