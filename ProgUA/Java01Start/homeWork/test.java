package ProgUA.Java01Start.homeWork;

import static java.lang.Math.round;

public class test {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);


        //double a = Double.parseDouble(scanner.nextLine());
        double a = 1.7;
        int b = (int)a;
        double c = ( a - (double)b);
        String d = Double.toString(c);
        String e = d.substring(2);

        System.out.println(a);
        System.out.println(b + "\n"  + c + "\n" + d);
        System.out.println(e);

    }
}
